package com.revature.banking.models;

public class Customer {
	private Integer cust_id;
	private Integer login_id;
	private String cust_name;
	
	public Customer() {
		super();
	}
	
	public Customer(Integer cust_id, Integer login_id, String cust_name) {
		super();
		this.cust_id = cust_id;
		this.login_id = login_id;
		this.cust_name = cust_name;
	}

	public Integer getCust_id() {
		return cust_id;
	}
	public void setCust_id(Integer cust_id) {
		this.cust_id = cust_id;
	}
	public Integer getLogin_id() {
		return login_id;
	}
	public void setLogin_id(Integer login_id) {
		this.login_id = login_id;
	}
	public String getCust_name() {
		return cust_name;
	}
	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}

	@Override
	public String toString() {
		return "Customer [cust_id=" + cust_id + ", login_id=" + login_id + ", cust_name=" + cust_name + "]";
	}
}
