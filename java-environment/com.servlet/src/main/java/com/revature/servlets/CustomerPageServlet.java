package com.revature.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.banking.dao.CustomerDAO;
import com.revature.banking.models.Account;
import com.revature.banking.models.Customer;
import com.revature.banking.utilities.DaoImplCreator;

@WebServlet("/view-customer")
public class CustomerPageServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		/*
		 * Session Attribute that was set in the AuthServlet
		 * Attributes are set as Objects, so we cast to an Integer
		 * 
		 * Realistically, we would want to do some type-checking 
		 * instead of blindly casting
		 */
		Integer id = (Integer)request.getSession().getAttribute("login_id");
		
		CustomerDAO cDao = DaoImplCreator.getCustomerDAO();
		Customer customer = cDao.selectCustomerByLoginId(id);
		
		List<Account> accounts = DaoImplCreator.getAccountsDAO().getAccountsByCustomerId(customer.getCust_id());		
		request.setAttribute("customer", customer);
		request.setAttribute("accounts", accounts);
		request.getRequestDispatcher("view-customer-account.jsp").forward(request, response);
	}
}
