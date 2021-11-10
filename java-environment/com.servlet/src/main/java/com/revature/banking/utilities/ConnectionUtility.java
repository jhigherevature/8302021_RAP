package com.revature.banking.utilities;

import java.io.FileInputStream;
import java.io.IOException;
// we will import a number of classes/interfaces from JDBC in java.sql package
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

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
	
	public static Connection getConnection_Props() throws SQLException, IOException {
		FileInputStream stream = new FileInputStream("db_resources/db-props.properties"); 
		Properties props = new Properties();
		props.load(stream);
		String url = props.getProperty("CONN_URL");
		String user = props.getProperty("CONN_USER");
		String pass = props.getProperty("CONN_PASS");
		return DriverManager.getConnection(url, user, pass);
	}
	
	public static Connection getConnection_Env() throws SQLException { 
		String url = System.getenv("CONN_URL");
		String user = System.getenv("CONN_USER");
		String pass = System.getenv("CONN_PASS");
		return DriverManager.getConnection(url, user, pass);
	}
}
