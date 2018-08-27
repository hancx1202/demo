package com.hancx.dao;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.transaction.annotation.Transactional;

import com.hancx.common.Dao;
import com.hancx.common.Page;
import com.hancx.util.Config;
/**
 * @author hanchuanxing
 * @date 2018年8月24日
 */
public abstract class AbstractBaseDao {
	@Resource
	protected Dao dao;
	
	 /**
     * 保存实体类
     */
    public void save(Object o) {
        if(o!=null&&!"".equals(o)){
        	dao.create(o);
        }
    }
    /**
     * 修改实体类
     */
    public void update(Object o) {
    	if(o!=null&&!"".equals(o)){
    		dao.update(o);
    	}
    }

    /**
     * 删除实体类
     */
    public void remove(Object o) {
    	if(o!=null&&!"".equals(o)){
        	dao.delete(o);
        }
    }
    /**
     * 删除多个实体类
     */
    public void removes(Serializable[] o,Class<?> clazz) {
    	if(o!=null&&!"".equals(o)){
    		for(Serializable id:o){
    			remove(get(clazz,id));
    		}
    	}
    }
    
    @SuppressWarnings("unchecked")
    @Transactional
	public <T> T get(Class<T> clazz, Serializable id) {
        return (T) dao.get(clazz, id);
    }
    
    public List<?> getByPropName(Class<?> clazz, String propName, Serializable value) {
    	StringBuilder sb=new StringBuilder();
    	sb.append("from ");
    	sb.append(clazz.getSimpleName());
    	sb.append(" where ");
    	sb.append(propName);
    	sb.append(" = ");
    	sb.append(" '");
    	sb.append(value);
    	sb.append("' ");
    	return dao.query(sb.toString());
    }



    /**
     * 查找所有的实体类的数据    
     *  @param
     *  @param clazz 
     * @return */
    public List<?> findAll(Class<?> clazz) {
        return dao.queryAll(clazz);
    }
    /**
     * 分页查找
     *  @param sql
     *  @param page
     *  @param rows
     * @return Page*/
	public Page<?> queryByPage(String sql,int page,int rows){
		boolean isOracle=false;
		String databaseType=Config.getProperty("DBType");
		if("Oracle".equals(databaseType)){
			isOracle=true;
		}
		Page<?> pagex=dao.queryPage(sql, page, rows, isOracle);
		return pagex;
	}
	/**
	 * 分页查找
	 *  @param sql
	 *  @param page
	 *  @param rows
	 * @return Page*/
	public Page<?> queryByPage(String sql,int page,int rows, Class<?> returnType){
		Page<?> pagex=dao.queryPage(sql, page, rows, true,returnType);
		return pagex;
	}
	/**
	 * sql
	 *  @param sql
	 * @return List*/
	public List<?> queryBysql(String sql){
		List<?> pagex=dao.queryWithJDBC(sql);
		return pagex;
	}
	/**
	 * hsql
	 *  @param hsql
	 * @return List*/
	public List<?> queryByhsql(String hsql){
		List<?> pagex=dao.query(hsql);
		return pagex;
	}
	/**
	 * sql
	 *  @param sql
	 * @return List*/
	public List<?> queryBysql(String sql,Class<?> returnType,Object... paramValue){
		List<?> pagex=dao.getList(sql,returnType,paramValue);
		return pagex;
	}
	
	public int getCount(String sql, Object... paramValue){
		return dao.getCount(sql, paramValue);
		
	}
	
	public void excute(String sql){
		dao.excute(sql);
	}
	
	/**
	 * 通过表名和主键ID获取主键最大值
	 * @param columnName
	 * @param tableName
	 * @return
	 */
	public int getMaxId(String columnName,String tableName){
		int value=0;
		String sql= " select max("+columnName+")+1 as maxIdValue from "+tableName+"";
		List result=dao.queryWithJDBC(sql);
		try {
			if(null!=result&&result.size()>0){
				Map map=(Map) result.get(0);
				value=((BigDecimal)map.get("MAXIDVALUE")).intValue();
			}
		} catch (Exception e) {
			value = 1;
		}
		return value;
	}
}
