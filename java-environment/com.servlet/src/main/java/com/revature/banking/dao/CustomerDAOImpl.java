package com.revature.banking.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.banking.models.Customer;
import com.revature.banking.utilities.ConnectionUtility;

public class CustomerDAOImpl implements CustomerDAO {

	@Override
	public boolean insertIntoCustomers(Customer customer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Customer selectCustomerById(Integer id) {
		PreparedStatement ps = null;
		ResultSet rs = null;
		Customer cust = null;

		try (Connection conn = ConnectionUtility.getConnection();) {
			String query = "SELECT * FROM examples.customers WHERE cust_id=?";

			ps = conn.prepareStatement(query);

			ps.setInt(1, id);

			rs = ps.executeQuery();

			while (rs.next()) {
				cust = new Customer(rs.getInt(1),rs.getInt(2),rs.getString(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cust;
	}

	@Override
	public Customer selectCustomerByLoginId(Integer id) {
		PreparedStatement ps = null;
		ResultSet rs = null;
		Customer cust = null;

		try (Connection conn = ConnectionUtility.getConnection();) {
			String query = "SELECT * FROM examples.customers WHERE login_id=?";

			ps = conn.prepareStatement(query);

			ps.setInt(1, id);

			rs = ps.executeQuery();

			while (rs.next()) {
				cust = new Customer(rs.getInt(1),rs.getInt(2),rs.getString(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cust;
	}

	@Override
	public List<Customer> selectAllCustomers() {
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Customer> cList = null;

		try (Connection conn = ConnectionUtility.getConnection();) {
			String query = "SELECT * FROM examples.customers";

			ps = conn.prepareStatement(query);

			rs = ps.executeQuery();

			cList = new ArrayList<Customer> ();
			
			while (rs.next()) {
				Customer cust = new Customer(rs.getInt(1),rs.getInt(2),rs.getString(3));
				cList.add(cust);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cList;
	}

	@Override
	public boolean updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteCustomer(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

}
