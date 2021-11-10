package com.revature.banking.utilities;

import com.revature.banking.dao.EmployeeDAO;
import com.revature.banking.dao.EmployeeDAOImpl;

public class DaoImplCreator {
	
	public EmployeeDAO eDao;
	
	public static EmployeeDAO getEmpDao() {
		return new EmployeeDAOImpl();
	}
}
