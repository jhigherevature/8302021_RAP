package com.revature.banking.utilities;

import java.sql.SQLException;

public class ConnectionTest {
	public static void main(String[] args) {
		try {
			ConnectionUtility.getConnection();
			System.out.println("A connection was established!");
		} catch (SQLException e) {
			System.out.println("An error occurred!");
			e.printStackTrace();
		}
	}
}
