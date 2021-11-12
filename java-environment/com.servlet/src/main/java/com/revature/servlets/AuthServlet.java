package com.revature.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.banking.services.AuthService;

@WebServlet("/login")
public class AuthServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException {
		String login_name = request.getParameter("login_name");
		String login_pass = request.getParameter("login_pass");
		String type = AuthService.getAuthenticationSingleton().AuthenticateUser(login_name, login_pass);
		HttpSession session = request.getSession(true);
		if (type == null) {
			response.sendRedirect("failed-login.jsp");
			return;
		}
		
		switch (type) {
		case "customer":
			session.setAttribute("login_id", AuthService.getCurrentCustomer().getLogin_id());
			// We use sendRedirect to process more data on another Servlet
			response.sendRedirect("view-customer");
			break;
		case "employee":
			session.setAttribute("login_id", AuthService.getCurrentEmployee().getLogin_id());
			// We use sendRedirect to process more data on another Servlet
			response.sendRedirect("view-employees");
			break;
		default:
			response.sendRedirect("failed-login.jsp");
			break;
		}
	}
}
