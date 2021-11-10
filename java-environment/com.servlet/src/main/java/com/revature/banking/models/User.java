package com.revature.banking.models;

public class User {
	private Integer user_id;
	private String user_name;
	private String user_address;
	private String user_phone;
	
	public User() {
		super();
	}
	
	public User(Integer user_id, String user_name, String user_address, String user_phone) {
		super();
		this.user_id = user_id;
		this.user_name = user_name;
		this.user_address = user_address;
		this.user_phone = user_phone;
	}
	
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_address() {
		return user_address;
	}
	public void setUser_address(String user_address) {
		this.user_address = user_address;
	}
	public String getUser_phone() {
		return user_phone;
	}
	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}
	
	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", user_name=" + user_name + ", user_address=" + user_address
				+ ", user_phone=" + user_phone + "]";
	}
}
