package com.revature.banking.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.banking.models.User_Login;
import com.revature.banking.utilities.ConnectionUtility;

public class UserLoginDAOImpl implements UserLoginDAO {

	@Override
	public boolean insertIntoUserLogin(User_Login user_login) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User_Login selectUserLoginById(Integer id) {
		PreparedStatement ps = null;
		ResultSet rs = null;
		User_Login login = null;

		try (Connection conn = ConnectionUtility.getConnection();) {
			String query = "SELECT * FROM examples.user_login WHERE login_id=?";

			ps = conn.prepareStatement(query);

			ps.setInt(1, id);

			rs = ps.executeQuery();

			while (rs.next()) {
				login = new User_Login(rs.getInt(1), rs.getString(2),rs.getString(3),rs.getInt(4));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return login;
	}
	
	@Override
	public User_Login selectUserLoginByNameAndPass(String username, String password) {
		PreparedStatement ps = null;
		ResultSet rs = null;
		User_Login login = null;

		try (Connection conn = ConnectionUtility.getConnection();) {
			String query = "SELECT * FROM examples.user_login WHERE login_name=? AND login_pass=?";

			ps = conn.prepareStatement(query);

			ps.setString(1, username);
			ps.setString(2, password);

			rs = ps.executeQuery();

			while (rs.next()) {
				login = new User_Login(rs.getInt(1), rs.getString(2),rs.getString(3),rs.getInt(4));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return login;
	}

	@Override
	public List<User_Login> selectAllUserLogin() {
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<User_Login> ulList = null;

		try (Connection conn = ConnectionUtility.getConnection();) {
			String query = "SELECT * FROM examples.user_login";

			ps = conn.prepareStatement(query);

			rs = ps.executeQuery();
			ulList = new ArrayList<User_Login>();
			while (rs.next()) {
				User_Login login = new User_Login(rs.getInt(1), rs.getString(2),rs.getString(3),rs.getInt(4));
				ulList.add(login);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ulList;
	}

	@Override
	public boolean updateUserLogin(User_Login user_login) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteUserLoginById(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}
}
