package com.revature.banking.app;

import java.sql.Date;
import java.util.List;

import com.revature.banking.dao.EmployeeDAO;
import com.revature.banking.dao.EmployeeDAOImpl;
import com.revature.banking.models.Employee;
import com.revature.banking.models.Example;

public class Simulator {
	public static void main(String[] args) {
//		EmployeeDAO edao = new EmployeeDAOImpl();
//		Employee e = edao.selectEmployeeById(2000);
//		System.out.println(e);
//		
//		List<Employee> eList = edao.selectAllEmployees();
//		for (Employee emp : eList) {
//			System.out.println(emp);
//		}
//		Employee add = new Employee(null, "From Java", "Java Test", 100.0, 10000);
//		if (edao.insertIntoEmployees(add)) {
//			System.out.println("Success!");
//		} else {
//			System.out.println("That action failed");
//		}
		
		java.sql.Date d = new java.sql.Date(System.currentTimeMillis());
		Example toAdd = new Example("Joseph", d);
		/*
		 * INVOKING DAO CODE HERE...
		 * 
		 * When setting the date for your perpared statement, you can 
		 * set as String (or date)
		 * 
		 * Another method:
		 * INSERT INTO schemaName.tableName VALUES(NULL,?,?,CURRENT_DATE,?)
		 */
		System.out.println(toAdd);
	}
}
