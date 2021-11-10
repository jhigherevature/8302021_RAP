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
	private static User_Login loggedIn;
	
	private UserLoginDAO ulDao;
	private EmployeeDAO eDao;
	private CustomerDAO cDao;
	// Customer and System Admin Daos...
	
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
		if (login == null) {
			// no login found with username/password combo
			return null;
		}
		
		return getUserLoginType(login);
	}
	
	public String getUserLoginType(User_Login uLogin) {
		Employee emp = eDao.selectEmployeeByLoginId(uLogin.getLogin_id());
		if (emp != null) {
			loggedIn = uLogin;
			return "employee";
		}
		
		Customer cust = cDao.selectCustomerByLoginId(uLogin.getLogin_id());
		if (cust != null) {
			return "customer";
		}
		
		// login not found in employee or customer tables
		return null;
	}
}
