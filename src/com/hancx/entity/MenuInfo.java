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
@Table(name="t_menuinfo")
public class MenuInfo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	@Column
	private String menuName;
	@Column
	private String href;
	@Column
	private long parent;
	@Column
	private String menuIcon;
	@Column
	private Integer orderNum;
	
	@OneToMany(mappedBy="menuInfo", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	private Set<RoleMenu> roleMenu = new HashSet<RoleMenu>();
	
	public MenuInfo() {}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

	public long getParent() {
		return parent;
	}

	public void setParent(long parent) {
		this.parent = parent;
	}

	public String getMenuIcon() {
		return menuIcon;
	}

	public void setMenuIcon(String menuIcon) {
		this.menuIcon = menuIcon;
	}

	public Integer getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(Integer orderNum) {
		this.orderNum = orderNum;
	}

	public Set<RoleMenu> getRoleMenu() {
		return roleMenu;
	}

	public void setRoleMenu(Set<RoleMenu> roleMenu) {
		this.roleMenu = roleMenu;
	}
}
