package com.revature.banking.models;

public class User_Login {
	private Integer login_id;
	private String login_name;
	private String login_pass;
	private Integer user_id;
	
	public User_Login() { 
		super(); 
	}
	
	public User_Login(Integer login_id, String login_name, String login_pass, Integer user_id) {
		super();
		this.login_id = login_id;
		this.login_name = login_name;
		this.login_pass = login_pass;
		this.user_id = user_id;
	}
	public Integer getLogin_id() {
		return login_id;
	}
	public void setLogin_id(Integer login_id) {
		this.login_id = login_id;
	}
	public String getLogin_name() {
		return login_name;
	}
	public void setLogin_name(String login_name) {
		this.login_name = login_name;
	}
	public String getLogin_pass() {
		return login_pass;
	}
	public void setLogin_pass(String login_pass) {
		this.login_pass = login_pass;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	@Override
	public String toString() {
		return "User_Login [login_id=" + login_id + ", login_name=" + login_name + ", login_pass=" + login_pass
				+ ", user_id=" + user_id + "]";
	}
}
