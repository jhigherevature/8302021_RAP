package com.revature.banking.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.banking.models.Account;
import com.revature.banking.utilities.ConnectionUtility;

public class AccountsDAOImpl implements AccountsDAO {

	@Override
	public boolean insertIntoAccounts(Account account) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Account getAccountById(Integer id) {
		PreparedStatement ps = null;
		ResultSet rs = null;
		Account acc = null;

		try (Connection conn = ConnectionUtility.getConnection();) {
			String query = "SELECT * FROM examples.accounts WHERE account_id=?";

			ps = conn.prepareStatement(query);

			ps.setInt(1, id);

			rs = ps.executeQuery();

			while (rs.next()) {
				acc = new Account(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getDouble(4), rs.getString(5));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return acc;
	}

	@Override
	public List<Account> getAccountsByCustomerId(Integer id) {
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Account> aList = null;

		try (Connection conn = ConnectionUtility.getConnection();) {
			String query = "SELECT * FROM examples.accounts WHERE primary_cust_id=? OR secondary_cust_id=?";

			ps = conn.prepareStatement(query);

			ps.setInt(1, id);
			ps.setInt(2, id);

			rs = ps.executeQuery();
			aList = new ArrayList<Account> ();
			while (rs.next()) {
				Account acc = new Account(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getDouble(4), rs.getString(5));
				aList.add(acc);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return aList;
	}

	@Override
	public List<Account> getAllAccounts() {
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Account> aList = null;

		try (Connection conn = ConnectionUtility.getConnection();) {
			String query = "SELECT * FROM examples.accounts";

			ps = conn.prepareStatement(query);

			rs = ps.executeQuery();
			aList = new ArrayList<Account> ();
			while (rs.next()) {
				Account acc = new Account(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getDouble(4), rs.getString(5));
				aList.add(acc);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return aList;
	}

	@Override
	public boolean updateAccount(Account account) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteAccount(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

}
