package com.revature.banking.dao;

import java.util.List;

import com.revature.banking.models.User;

public interface UsersDAO {
	public boolean insertIntoUsers(User user);
	public User selectUserById(Integer id);
	public List<User> selectAllUsers();
	public boolean updateUser(User user);
	public boolean deleteUserById(Integer id);
}
