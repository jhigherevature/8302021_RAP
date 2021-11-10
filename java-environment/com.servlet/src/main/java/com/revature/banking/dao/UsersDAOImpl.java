package com.revature.banking.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.banking.models.User;
import com.revature.banking.utilities.ConnectionUtility;

public class UsersDAOImpl implements UsersDAO {

	@Override
	public boolean insertIntoUsers(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User selectUserById(Integer id) {
		PreparedStatement ps = null;
		ResultSet rs = null;
		User user = null;

		try (Connection conn = ConnectionUtility.getConnection();) {
			String query = "SELECT * FROM examples.users WHERE user_id=?";

			ps = conn.prepareStatement(query);

			ps.setInt(1, id);

			rs = ps.executeQuery();

			while (rs.next()) {
				user = new User(rs.getInt(1),rs.getString(2), rs.getString(3), rs.getString(4));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}

	@Override
	public List<User> selectAllUsers() {
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<User> uList = null;

		try (Connection conn = ConnectionUtility.getConnection();) {
			String query = "SELECT * FROM examples.users";

			ps = conn.prepareStatement(query);

			rs = ps.executeQuery();

			uList = new ArrayList<User>();
			
			while (rs.next()) {
				User user = new User(rs.getInt(1),rs.getString(2), rs.getString(3), rs.getString(4));
				uList.add(user);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return uList;
	}

	@Override
	public boolean updateUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteUserById(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

}
