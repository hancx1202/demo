package com.hancx.common;

import java.io.Serializable;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
/**
 * @author hanchuanxing
 * @date 2018年8月24日
 */
public class BaseDao<T> extends NamedParameterJdbcDaoSupport implements Dao {
	
	private HibernateTemplate hibernateTemplate;

	@Override
	public Serializable create(Object obj) {
		// TODO Auto-generated method stub
		return hibernateTemplate.save(obj);
	}

	@Override
	public void update(Object obj) {
		// TODO Auto-generated method stub
		hibernateTemplate.saveOrUpdate(obj);
	}

	@Override
	public void delete(Object obj) {
		// TODO Auto-generated method stub
		hibernateTemplate.delete(obj);
	}

	@Override
	public Object load(Class<?> entityClass, Serializable id) {
		// TODO Auto-generated method stub
		Object obj = null;
		try {
			obj = hibernateTemplate.load(entityClass, id);
		} catch (Exception e) {
			// TODO: handle exception
			logger.error(e);
		}
		return obj;
	}

	@Override
	public Object get(String className, Serializable id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object get(Class<?> entityClass, Serializable id) {
		// TODO Auto-generated method stub
		Object obj = null;
		try {
			obj = hibernateTemplate.get(entityClass, id);
		} catch (Exception e) {
			logger.error(e);
		}
		return obj;
	}

	@Override
	public List<?> query(String hql) {
		// TODO Auto-generated method stub
		return hibernateTemplate.find(hql);
	}

	@Override
	public List<?> queryAll(Class<?> clazz) {
		// TODO Auto-generated method stub
		String queryString = "select o from " + clazz.getName() + " as o";
		return hibernateTemplate.find(queryString);
	}

	@Override
	public void refresh(Object obj) {
		// TODO Auto-generated method stub
		hibernateTemplate.refresh(obj);
	}

	@Override
	public void evict(Object entity) {
		// TODO Auto-generated method stub
		hibernateTemplate.evict(entity);
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		hibernateTemplate.flush();
	}
	
	@Override
	public List<?> queryWithJDBC(String sql) {
		// TODO Auto-generated method stub
		return this.getJdbcTemplate().queryForList(sql);
	}
	
	public List<?> queryWithJDBC(String sql, Class<?> elementType) {
		return this.getJdbcTemplate().queryForList(sql, elementType);
	}

	@Override
	public List<?> queryWithJDBC(String sql, Class<?> elementType,
			Object... paramValue) {
		// TODO Auto-generated method stub
		return getList(sql, elementType, paramValue);
	}
	

	@Override
	public void excute(String sql) {
		// TODO Auto-generated method stub
		this.getJdbcTemplate().execute(sql);
	}

	/**
     * jdbcִ��update
     * @param namedSql
     * @param javaBean
     * @return
     */
	@Override
	public int update(String namedSql, Object javaBean) {
		// TODO Auto-generated method stub
		SqlParameterSource paramSource = new BeanPropertySqlParameterSource(
                javaBean);
        return this.getNamedParameterJdbcTemplate().update(namedSql,paramSource);
	}

	@Override
	public int commonUpdate(String sql, Object... paramValue) {
		// TODO Auto-generated method stub
		return this.getJdbcTemplate().update(sql, paramValue);
	}

	@Override
	public Object getJavaBean(String sql, Class<?> returnType,
			Object... paramValue) {
		// TODO Auto-generated method stub
		RowMapper<T> rowMapper = new BeanPropertyRowMapper<T>((Class<T>) returnType);
        try{
        return this.getJdbcTemplate()
                .queryForObject(sql, rowMapper, paramValue);
        }catch(Exception ex){
			return ex;
        }
	}

	@Override
	public List<?> getList(String sql, Class<?> returnType,
			Object... paramValue) {
		// TODO Auto-generated method stub
		RowMapper<T> rowMapper = new BeanPropertyRowMapper<T>((Class<T>) returnType);
        return this.getJdbcTemplate().query(sql, rowMapper, paramValue);
	}

	@Override
	public List<?> getList(String sql, Class<?> returnType) {
		// TODO Auto-generated method stub
		RowMapper<T> rowMapper = new BeanPropertyRowMapper<T>((Class<T>) returnType);
        return this.getJdbcTemplate().query(sql, rowMapper);
	}

	/**
     * �����ܼ�¼��
     *
     * @param countSQL
     *            �����ܼ�¼����count���
     * @param paramValue
     *            ����ж�Ӧ�Ĳ���ֵ
     * @return �ܼ�¼��
     */
	public int getCount(String countSQL, List<?> paramValue) {
        return Integer.parseInt( this.getJdbcTemplate().queryForList(countSQL,
                paramValue.toArray()).get(0).get("COUNT(*)").toString());
    }
 
	/**
	 * �����ܼ�¼��
	 * @param countSQL
	 * @param paramValue
	 * @return
	 */
	public int getCount(String countSQL, Object... paramValue) {
        return  Integer.parseInt(this.getJdbcTemplate().queryForList(countSQL,
        		paramValue).get(0).get("COUNT(*)").toString());
    }

	@Override
	public List<?> getList(String sql, Object... paramValue) {
		// TODO Auto-generated method stub
		return this.getJdbcTemplate().queryForList(sql, paramValue);
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	public Page<?> queryPage(String sql, int page, int rows, boolean hasoffset) {
		// TODO Auto-generated method stub
		int start=(page-1)*rows;
		 StringBuffer pagesql=new StringBuffer(sql.length()+20);
		 StringBuffer totalsql=new StringBuffer(sql.length()+20);
		 totalsql.append("select count(*)  from (");
		 if(hasoffset){
		    pagesql.append("select * from (select row_.*,rownum rownum_ from(");
		 }
		 else{
		    pagesql.append("select * from( ");
		 }
		 pagesql.append(sql);
		 totalsql.append(sql);
		 if(hasoffset){
		    pagesql.append(") row_ where rownum<="+(start+rows)+") t where rownum_>"+start+"");
		 }
		else{
		 pagesql.append(") t  limit "+start+","+rows+"");
		}
		 totalsql.append(") t");
		 System.out.println(totalsql.toString());
		 System.out.println(pagesql.toString());
		 int srs=this.getCount(totalsql.toString());
		 long total=srs;
		 List<?> list=this.queryWithJDBC(pagesql.toString());
		 //List<?> list=this.getJdbcTemplate().queryForList(pagesql.toString());
		 return new Page(list,total);
	}

	@Override
	public Page<?> queryPage(String sql, int page, int rows, boolean hasoffset,
			Class<?> returnType) {
		// TODO Auto-generated method stub
		int start=(page-1)*rows;
		 StringBuffer pagesql=new StringBuffer(sql.length()+20);
		 StringBuffer totalsql=new StringBuffer(sql.length()+20);
		 totalsql.append("select count(*)  from (");
		 if(hasoffset){
		    pagesql.append("select * from (select row_.*,rownum rownum_ from(");
		 }
		 else{
		    pagesql.append("select * from( ");
		 }
		 pagesql.append(sql);
		 totalsql.append(sql);
		 if(hasoffset){
		    pagesql.append(") row_ where rownum<="+(start+rows)+") t where rownum_>"+start+"");
		 }
		else{
		 pagesql.append(") t  limit "+start+","+rows+"");
		}
		 totalsql.append(") t");
		 System.out.println(totalsql.toString());
		 System.out.println(pagesql.toString());
		 int srs=this.getCount(totalsql.toString());
		 long total=srs;
		 List<?> list=this.getList(pagesql.toString(), returnType);
		 return new Page(list,total);
	}
}
