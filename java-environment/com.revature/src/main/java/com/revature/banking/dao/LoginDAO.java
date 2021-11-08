package com.revature.banking.dao;

import com.revature.banking.models.Login;

public interface LoginDAO {
	public Login selectLoginByUserAndPass(String user_name, String user_pass);
}
