package com.revature.banking.dao;

import java.util.List;

import com.revature.banking.models.Account;

public interface AccountsDAO {
	public boolean insertIntoAccounts(Account account);
	public Account getAccountById(Integer id);
	public List<Account> getAccountsByCustomerId(Integer id);
	public List<Account> getAllAccounts();
	public boolean updateAccount(Account account);
	public boolean deleteAccount(Integer id);
}
