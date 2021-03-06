package com.revature.banking.app;

import java.util.List;

import com.revature.banking.dao.AccountsDAO;
import com.revature.banking.dao.AccountsDAOImpl;
import com.revature.banking.dao.CustomerDAO;
import com.revature.banking.dao.CustomerDAOImpl;
import com.revature.banking.dao.EmployeeDAO;
import com.revature.banking.dao.EmployeeDAOImpl;
import com.revature.banking.dao.UserLoginDAO;
import com.revature.banking.dao.UserLoginDAOImpl;
import com.revature.banking.dao.UsersDAO;
import com.revature.banking.dao.UsersDAOImpl;
import com.revature.banking.models.Account;
import com.revature.banking.models.Customer;
import com.revature.banking.models.Employee;
import com.revature.banking.models.Example;
import com.revature.banking.models.User;
import com.revature.banking.models.User_Login;
import com.revature.banking.services.AuthService;
import com.revature.banking.utilities.DaoImplCreator;

public class Simulator {
	public static void main(String[] args) {
		EmployeeDAO eDao = new EmployeeDAOImpl();
//		Employee e = edao.selectEmployeeById(1000);
		Employee e = DaoImplCreator.getEmpDao().selectEmployeeById(2000);
		System.out.println(e);

		List<Employee> eList = eDao.selectAllEmployees();
		for (Employee emp : eList) {
			System.out.println(emp);
		}
		Employee add = new Employee(null, "From Java", "Java Test", 100.0, 10000);
		if (eDao.insertIntoEmployees(add)) {
			System.out.println("Success!");
		} else {
			System.out.println("That action failed");
		}
		java.sql.Date d = new java.sql.Date(System.currentTimeMillis());
		Example toAdd = new Example("Joseph", d);
		/*
		 * INVOKING DAO CODE HERE...
		 * 
		 * When setting the date for your perpared statement, you can set as String (or
		 * date)
		 * 
		 * Another method: INSERT INTO schemaName.tableName
		 * VALUES(NULL,?,?,CURRENT_DATE,?)
		 */
		System.out.println(toAdd);
		UsersDAO uDao = new UsersDAOImpl();
		List<User> ulist = uDao.selectAllUsers();
		System.out.println(ulist);

		CustomerDAO cDao = new CustomerDAOImpl();
		List<Customer> cList = cDao.selectAllCustomers();
		System.out.println(cList);
		UserLoginDAO ulDao = new UserLoginDAOImpl();
		List<User_Login> ulList = ulDao.selectAllUserLogin();
		System.out.println(ulList);
		User_Login check = ulDao.selectUserLoginByNameAndPass("maggie_login", "maggie_pass");
		AuthService auth = new AuthService();
		auth.init();
		// the following two strings obtained via Scanner/input collection
		String uNameInput = "maggie_login";
		String uPassInput = "maggie_pass";
		// verify that login credentials for user...
		String loginType = auth.AuthenticateUser(uNameInput, uPassInput);

		if (loginType.equals("employee")) {
			// create "employeeActionService" and call the appropriate method
		} else if (loginType.equals("customer")) {

		}
		System.out.println(auth.AuthenticateUser("maggie_login", "maggie_pass"));
		System.out.println(auth.AuthenticateUser("tyler_login", "tyler_pass"));

		AccountsDAO aDao = new AccountsDAOImpl();
		List<Account> aList = aDao.getAccountsByCustomerId(1001);
		System.out.println(aList);
	}
}
