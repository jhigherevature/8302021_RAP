package com.revature.banking.utilities;

// we will import a number of classes/interfaces from JDBC in java.sql package
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtility {
	/*
	 * This method will be used to establish a connection to our database
	 * using a very simple methodology
	 */
	public static Connection getConnection() throws SQLException {
		/* 
		 * DriverManager.getConnection takes a string value for:
		 * 		DB url
		 * 		DB username
		 * 		DB password
		 * 
		 * The Username and password are based off a user that you can
		 * create using DDL and DCL
		 * 
		 * The URL for a postgresql database connection uses the following 
		 * syntax:
		 * 		jdbc:postgresql://{host}[:{port}]/[{database}]
		 */
		String url = "jdbc:postgresql://localhost:5432/postgres";
		String user = "customers";
		String pass = "password";
		return DriverManager.getConnection(url, user, pass);
	}
}
