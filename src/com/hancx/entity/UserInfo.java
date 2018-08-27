package com.hancx.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
/**
 * @author hanchuanxing
 * @date 2018年8月24日
 */
@Entity
@Table(name = "t_userinfo")
public class UserInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(nullable=false,unique=true)
	private String loginName;
	@Column
	private String realName;
	@Column
	private String password;
	@Column
	private String phone;
	@Column
	private String email;
	@Column
	private String birthday;
	@Column
	private String sex;
	@Column
	private long companyId;
	@Column
	private long deptId;
	@Column
	private Integer positionId;
	@Column
	private String state;
	@Column
	private String createTime;
	@Column
	private String createOperId;
	@Column
	private String loginTimes;
	@Column
	private String expireTime;
	@Column
	private String expireflag;
	@Column
	private String lastModifytime;
	@Column
	private String lastModifyOperId;
	@Column
	private String remark;
	
	@OneToMany(mappedBy="userInfo", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	private Set<UserRole> userRole = new HashSet<UserRole>();

	public UserInfo() {
	}

	public UserInfo(String loginName, String password) {
		this.loginName = loginName;
		this.password = password;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(long companyId) {
		this.companyId = companyId;
	}

	public long getDeptId() {
		return deptId;
	}

	public void setDeptId(long deptId) {
		this.deptId = deptId;
	}

	public Integer getPositionId() {
		return positionId;
	}

	public void setPositionId(Integer positionId) {
		this.positionId = positionId;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getCreateOperId() {
		return createOperId;
	}

	public void setCreateOperId(String createOperId) {
		this.createOperId = createOperId;
	}

	public String getLoginTimes() {
		return loginTimes;
	}

	public void setLoginTimes(String loginTimes) {
		this.loginTimes = loginTimes;
	}

	public String getExpireTime() {
		return expireTime;
	}

	public void setExpireTime(String expireTime) {
		this.expireTime = expireTime;
	}

	public String getExpireflag() {
		return expireflag;
	}

	public void setExpireflag(String expireflag) {
		this.expireflag = expireflag;
	}

	public String getLastModifytime() {
		return lastModifytime;
	}

	public void setLastModifytime(String lastModifytime) {
		this.lastModifytime = lastModifytime;
	}

	public String getLastModifyOperId() {
		return lastModifyOperId;
	}

	public void setLastModifyOperId(String lastModifyOperId) {
		this.lastModifyOperId = lastModifyOperId;
	}
	
	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Set<UserRole> getUserRole() {
		return userRole;
	}

	public void setUserRole(Set<UserRole> userRole) {
		this.userRole = userRole;
	}

	@Override
	public String toString() {
		return "UserInfo [id=" + id + ", loginName=" + loginName
				+ ", realName=" + realName + ", password=" + password
				+ ", phone=" + phone + ", email=" + email + ", birthday="
				+ birthday + ", sex=" + sex + ", companyId=" + companyId
				+ ", deptId=" + deptId + ", positionId=" + positionId
				+ ", state=" + state + ", createTime=" + createTime
				+ ", createOperId=" + createOperId + ", loginTimes="
				+ loginTimes + ", expireTime=" + expireTime + ", expireflag="
				+ expireflag + ", lastModifytime=" + lastModifytime
				+ ", lastModifyOperId=" + lastModifyOperId + "]";
	}

}
