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
@Table(name = "t_roleinfo")
public class RoleInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(nullable = false, unique = true)
	private String roleName;
	@Column
	private String remark;
	@OneToMany(mappedBy = "roleInfo", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<UserRole> userRole = new HashSet<UserRole>();

	@OneToMany(mappedBy = "roleInfo", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<RoleMenu> roleMenu = new HashSet<RoleMenu>();

	public RoleInfo() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
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

	public Set<RoleMenu> getRoleMenu() {
		return roleMenu;
	}

	public void setRoleMenu(Set<RoleMenu> roleMenu) {
		this.roleMenu = roleMenu;
	}
}
