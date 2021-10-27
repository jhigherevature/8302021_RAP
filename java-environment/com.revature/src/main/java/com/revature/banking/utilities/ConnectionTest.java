package com.revature.banking.utilities;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionTest {
	public static void main(String[] args) {
		/*
		 * try-with-resources : Establish a resource to be used in a
		 * try-catch block prior to the execution of any of the try-block
		 * code.
		 */
		try (Connection conn = ConnectionUtility.getConnection();) { 
			System.out.println("A connection was established!");
		} catch (SQLException e) {
			System.out.println("An error occurred!");
			e.printStackTrace();
		}
		
		try (Connection conn = ConnectionUtility.getConnection_Props();) { 
			System.out.println("[Properties File] A connection was established!");
		} catch (SQLException e) {
			System.out.println("An SQL error occurred!");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("An IO error occurred!");
			e.printStackTrace();
		}
		
		try (Connection conn = ConnectionUtility.getConnection_Env();) { 
			System.out.println("[Environment Variables] A connection was established!");
		} catch (SQLException e) {
			System.out.println("An SQL error occurred!");
			e.printStackTrace();
		}
	}
}
