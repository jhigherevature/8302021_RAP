package com.revature.banking.models;

public class Account {
	private Integer account_id;
	private Integer primary_cust_id;
	private Integer secondary_cust_id;
	private Double account_value;
	private String account_type;
	
	public Account() {
		super();
	}

	public Account(Integer account_id, Integer primary_cust_id, Integer secondary_cust_id, Double account_value,
			String account_type) {
		super();
		this.account_id = account_id;
		this.primary_cust_id = primary_cust_id;
		this.secondary_cust_id = secondary_cust_id;
		this.account_value = account_value;
		this.account_type = account_type;
	}

	public Integer getAccount_id() {
		return account_id;
	}

	public void setAccount_id(Integer account_id) {
		this.account_id = account_id;
	}

	public Integer getPrimary_cust_id() {
		return primary_cust_id;
	}

	public void setPrimary_cust_id(Integer primary_cust_id) {
		this.primary_cust_id = primary_cust_id;
	}

	public Integer getSecondary_cust_id() {
		return secondary_cust_id;
	}

	public void setSecondary_cust_id(Integer secondary_cust_id) {
		this.secondary_cust_id = secondary_cust_id;
	}

	public Double getAccount_value() {
		return account_value;
	}

	public void setAccount_value(Double account_value) {
		this.account_value = account_value;
	}

	public String getAccount_type() {
		return account_type;
	}

	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}

	@Override
	public String toString() {
		return "Account [account_id=" + account_id + ", primary_cust_id=" + primary_cust_id + ", secondary_cust_id="
				+ secondary_cust_id + ", account_value=" + account_value + ", account_type=" + account_type + "]";
	}
}
