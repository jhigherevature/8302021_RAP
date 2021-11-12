package com.revature.banking.services;

import com.revature.banking.dao.CustomerDAO;
import com.revature.banking.dao.CustomerDAOImpl;
import com.revature.banking.dao.EmployeeDAO;
import com.revature.banking.dao.EmployeeDAOImpl;
import com.revature.banking.dao.UserLoginDAO;
import com.revature.banking.dao.UserLoginDAOImpl;
import com.revature.banking.models.Customer;
import com.revature.banking.models.Employee;
import com.revature.banking.models.User_Login;

public class AuthService {
	private UserLoginDAO ulDao;
	private EmployeeDAO eDao;
	private CustomerDAO cDao;
	// Customer and System Admin Daos...
	
	private static AuthService auth = new AuthService ();
	private static Customer currentCustomer;
	private static Employee currentEmployee;
	
	private AuthService() { }
	
	public static AuthService getAuthenticationSingleton() {
		if (auth.ulDao == null || auth.eDao == null || auth.cDao == null)
			auth.init();
		
		return auth;
	}
	
	public static Customer getCurrentCustomer() {
		return currentCustomer;
	}
	
	public static Employee getCurrentEmployee() {
		return currentEmployee;
	}
	
	public void init() {
		ulDao = new UserLoginDAOImpl();
		eDao = new EmployeeDAOImpl();
		cDao = new CustomerDAOImpl();
	}

	public String AuthenticateUser(String username, String password) {
		if (username == null || password == null) {
			// missing username or password
			return null;
		}
		
		User_Login login = ulDao.selectUserLoginByNameAndPass(username, password);
		return getUserLoginType(login);
	}
	
	public String getUserLoginType(User_Login uLogin) {
		if (uLogin == null) {
			// no login provided
			return null;
		}
		
		currentEmployee = eDao.selectEmployeeByLoginId(uLogin.getLogin_id());
		if (currentEmployee != null) {
			return "employee";
		}
		
		currentCustomer = cDao.selectCustomerByLoginId(uLogin.getLogin_id());
		if (currentCustomer != null) {
			return "customer";
		}
		
		// login not found in employee or customer tables
		return null;
	}
}
