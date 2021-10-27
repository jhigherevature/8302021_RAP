package com.revature.banking.dao;

import java.util.List;

import com.revature.banking.models.Employee;

/*
 * The DAO interface defines the methods which perform basic operations
 * on our database, based on a particular table and model class
 */
public interface EmployeeDAO {
	public boolean insertIntoEmployees(Employee emp);
	public Employee selectEmployeeById(Integer id);
	public List<Employee> selectAllEmployees();
	public boolean updateEmployee(Employee emp);
	public boolean deleteEmployeeById(Integer id);
}
