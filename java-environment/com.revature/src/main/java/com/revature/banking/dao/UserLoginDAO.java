package com.revature.banking.dao;

import java.util.List;

import com.revature.banking.models.User_Login;

public interface UserLoginDAO {
	public boolean insertIntoUserLogin(User_Login user_login);
	public User_Login selectUserLoginById(Integer id);
	public User_Login selectUserLoginByNameAndPass(String username, String password);
	public List<User_Login> selectAllUserLogin();
	public boolean updateUserLogin(User_Login user_login);
	public boolean deleteUserLoginById(Integer id);
}
