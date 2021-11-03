package com.revature.banking.app;

import java.util.List;

import com.revature.banking.dao.EmployeeDAO;
import com.revature.banking.dao.EmployeeDAOImpl;
import com.revature.banking.models.Employee;

public class Simulator {
	public static void main(String[] args) {
		EmployeeDAO edao = new EmployeeDAOImpl();
		Employee e = edao.selectEmployeeById(2000);
		System.out.println(e);
		
		List<Employee> eList = edao.selectAllEmployees();
		for (Employee emp : eList) {
			System.out.println(emp);
		}
		
//		Employee add = new Employee(null, "From Java", "Java Test", 100.0, 10000);
//		if (edao.insertIntoEmployees(add)) {
//			System.out.println("Success!");
//		} else {
//			System.out.println("That action failed");
//		}
	}
}
