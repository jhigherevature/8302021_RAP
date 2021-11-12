package com.revature.banking.utilities;

import java.io.FileInputStream;
import java.io.IOException;
// we will import a number of classes/interfaces from JDBC in java.sql package
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

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

public class ConnectionUtility {
	/*
	 * This method will be used to establish a connection to our database
	 * using a very simple methodology
	 */
	public static Connection getConnection() throws SQLException {
		Connection conn = null;
		
		try {
			Class.forName("org.postgresql.Driver");
			String url = "jdbc:postgresql://localhost:5432/postgres";
			String user = "customers";
			String pass = "password";
			conn = DriverManager.getConnection(url, user, pass);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return conn;
	}
}
