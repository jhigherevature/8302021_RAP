package com.revature.banking.utilities;

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

public class DaoImplCreator {
	public static AccountsDAO getAccountsDAO() {
		return new AccountsDAOImpl();
	}
	public static CustomerDAO getCustomerDAO() {
		return new CustomerDAOImpl();
	}
	public static EmployeeDAO getEmployeeDAO() {
		return new EmployeeDAOImpl();
	}
	public static UserLoginDAO getUserLoginDAO() {
		return new UserLoginDAOImpl();
	}
	public static UsersDAO getUsersDAO() {
		return new UsersDAOImpl();
	}
}
