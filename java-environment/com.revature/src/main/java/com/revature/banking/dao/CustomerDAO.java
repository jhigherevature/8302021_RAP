package com.revature.banking.dao;

import java.util.List;

import com.revature.banking.models.Customer;

public interface CustomerDAO {
	public boolean insertIntoCustomers(Customer customer);
	public Customer selectCustomerById(Integer id);
	public Customer selectCustomerByLoginId(Integer id);
	public List<Customer> selectAllCustomers();
	public boolean updateCustomer(Customer customer);
	public boolean deleteCustomer(Integer id);
}
