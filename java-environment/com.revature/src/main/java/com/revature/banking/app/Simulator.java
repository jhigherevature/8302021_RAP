package com.revature.banking.app;

import java.util.List;

import com.revature.banking.dao.CustomerDAO;
import com.revature.banking.dao.CustomerDAOImpl;
import com.revature.banking.dao.UserLoginDAO;
import com.revature.banking.dao.UserLoginDAOImpl;
import com.revature.banking.dao.UsersDAO;
import com.revature.banking.dao.UsersDAOImpl;
import com.revature.banking.models.Customer;
import com.revature.banking.models.User;
import com.revature.banking.models.User_Login;
import com.revature.banking.services.AuthService;

public class Simulator {
	public static void main(String[] args) {
		// EmployeeDAO eDao = new EmployeeDAOImpl();
		// Employee e = edao.selectEmployeeById(1000);
		
//		Employee e = DaoImplCreator.getEmpDao().selectEmployeeById(2000);
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
		
//		java.sql.Date d = new java.sql.Date(System.currentTimeMillis());
//		Example toAdd = new Example("Joseph", d);
		/*
		 * INVOKING DAO CODE HERE...
		 * 
		 * When setting the date for your perpared statement, you can 
		 * set as String (or date)
		 * 
		 * Another method:
		 * INSERT INTO schemaName.tableName VALUES(NULL,?,?,CURRENT_DATE,?)
		 */
//		System.out.println(toAdd);
		
		UsersDAO uDao = new UsersDAOImpl();
		List<User> ulist = uDao.selectAllUsers();
		System.out.println(ulist);
		
		UserLoginDAO ulDao = new UserLoginDAOImpl();
		List<User_Login> ulList = ulDao.selectAllUserLogin();
		System.out.println(ulList);
		
		CustomerDAO cDao = new CustomerDAOImpl();
		List<Customer> cList = cDao.selectAllCustomers();
		System.out.println(cList);
		
		User_Login check = ulDao.selectUserLoginByNameAndPass("maggie_login", "maggie_pass");
		AuthService auth = new AuthService();
		auth.init();
		System.out.println(auth.AuthenticateUser("maggie_login", "maggie_pass"));
		System.out.println(auth.AuthenticateUser("tyler_login", "tyler_pass"));
	}
}
