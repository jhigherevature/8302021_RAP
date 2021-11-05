package com.revature.banking.models;

import java.sql.Date;

public class Example {
	private String name;
	private Date insertDate;
	public Example(String name, Date insertDate) {
		super();
		this.name = name;
		this.insertDate = insertDate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getInsertDate() {
		return insertDate;
	}
	public void setInsertDate(Date insertDate) {
		this.insertDate = insertDate;
	}
	@Override
	public String toString() {
		return "Example [name=" + name + ", insertDate=" + insertDate + "]";
	}
	
	
}
