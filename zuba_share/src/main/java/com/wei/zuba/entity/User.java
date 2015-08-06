/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.wei.zuba.entity;

import org.hibernate.validator.constraints.*;

/**
 * 用户Entity
 * @author ThinkGem
 * @version 2013-12-05
 */
public class User {
	private static final long serialVersionUID = 1L;
	
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	private String loginName;// 登录名
	private String password;// 密码
	private String userName;
	private String email;	// 邮箱
	
	private boolean enableStatus;
	
	public boolean getEnableStatus() {
		return enableStatus;
	}
	public void setEnableStatus(boolean enableStatus) {
		this.enableStatus = enableStatus;
	}
	
	@Length(min=1, max=100, message="登录名长度必须介于 1 和 100 之间")
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Email(message="邮箱格式不正确")
	@Length(min=0, max=200, message="邮箱长度必须介于 1 和 200 之间")
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}