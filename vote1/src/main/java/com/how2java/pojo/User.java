package com.how2java.pojo;

public class User {
	private int id;
	private String UserAccount;
	private String password;
	private String username;
	private String sex;
	private String signature;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserAccount() {
		return UserAccount;
	}
	public void setUserAccount(String userAccount) {
		UserAccount = userAccount;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getSignature() {
		return signature;
	}
	public void setSignature(String signature) {
		this.signature = signature;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", UserAccount=" + UserAccount + ", password=" + password + ", username="
				+ username + ", sex=" + sex + ", signature=" + signature + "]";
	}
	
	
}
