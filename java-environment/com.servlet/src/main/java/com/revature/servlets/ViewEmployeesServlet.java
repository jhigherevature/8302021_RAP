package com.revature.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.banking.dao.EmployeeDAO;
import com.revature.banking.models.Employee;
import com.revature.banking.utilities.DaoImplCreator;

@WebServlet("/view-employees")
public class ViewEmployeesServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		EmployeeDAO eDao = DaoImplCreator.getEmployeeDAO();
		List<Employee> employees = eDao.selectAllEmployees();

		request.setAttribute("list", employees);
		request.getRequestDispatcher("view-employees.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
