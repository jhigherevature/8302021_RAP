package com.revature.banking.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.banking.models.Employee;
import com.revature.banking.utilities.ConnectionUtility;
import com.revature.logging.LogSimulator;

/*
 * Implementation classes for the DAO interface provide a way
 * to detail different implementation details for methods, for
 * example, communicating with different databases or SQL dialects
 */
public class EmployeeDAOImpl implements EmployeeDAO {

	@Override
	public boolean insertIntoEmployees(Employee emp) {
		PreparedStatement ps = null;
		try (Connection conn = ConnectionUtility.getConnection();) {
			String query = "INSERT INTO examples.employees VALUES(NULL,?,?,?,?)";

			ps = conn.prepareStatement(query);

			ps.setString(1, emp.getEmp_name());
			ps.setString(2, emp.getEmp_title());
			ps.setDouble(3, emp.getEmp_salary());
			ps.setInt(4, emp.getLogin_id());

			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Problem here!");
			// mainapp.restart();
			return false;
		}
		return true;
	}

	@Override
	public Employee selectEmployeeById(Integer id) {
		PreparedStatement ps = null;
		ResultSet rs = null;
		Employee emp = null;

		try (Connection conn = ConnectionUtility.getConnection();) {
			/*
			 * The '?' below acts as a marker for a parameter within our SQL query. The
			 * preparedStatement object provides methods that allow you do insert values
			 * into these marker locations using the position of the marker (indexing here,
			 * starts at 1) and also allows you to set the datatype of the value as well!
			 */
			String query = "SELECT * FROM examples.employees WHERE emp_id=?";

			/*
			 * The connection object's prepareStatement method will convert a String to a
			 * PreparedStatement object
			 */
			ps = conn.prepareStatement(query);

			/*
			 * The preparedStatement object supplies methods to set values for the marker
			 * indexes within the String query that was created above
			 */
			ps.setInt(1, id);

			/*
			 * The executeQuery method of the prepared statement will return a result set,
			 * based on the values that are retrieved from the database.
			 * 
			 * One thing to keep in mind about the resultSet. As it's name implies, it is a
			 * collection of data
			 */
			rs = ps.executeQuery();

			while (rs.next()) {
				emp = new Employee();
				emp.setEmp_id(rs.getInt(1));
				emp.setEmp_name(rs.getString(2));
				emp.setEmp_title(rs.getString("emp_title"));
				emp.setEmp_salary(rs.getDouble("emp_salary"));
				emp.setLogin_id(rs.getInt(5));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		LogSimulator.getLogger().trace("Employee ID: " + id + ", retrieved!");
		return emp;
	}

	@Override
	public List<Employee> selectAllEmployees() {
		Statement stmt = null;
		ResultSet rs = null;
		List<Employee> eList = null;

		try (Connection conn = ConnectionUtility.getConnection();) {
			String query = "SELECT * FROM examples.employees";

			/*
			 * The connection object's createStatement method will return a simple statement
			 * object
			 */
			stmt = conn.createStatement();

			// With simple statements, we execute the query provided
			// as an argument to the method
			rs = stmt.executeQuery(query);

			/*
			 * Because the eList ref variable was set to null above we need to remember to
			 * initialize it with a new List that we can populate...
			 */
			eList = new ArrayList<Employee>();

			while (rs.next()) {
				Employee emp = new Employee();
				emp.setEmp_id(rs.getInt(1));
				emp.setEmp_name(rs.getString(2));
				emp.setEmp_title(rs.getString("emp_title"));
				emp.setEmp_salary(rs.getDouble("emp_salary"));
				emp.setLogin_id(rs.getInt(5));

				eList.add(emp);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		LogSimulator.getLogger().trace("All employees queried");
		return eList;
	}

	@Override
	public boolean updateEmployee(Employee emp) {
		PreparedStatement ps = null;

		try (Connection conn = ConnectionUtility.getConnection()) {
			String query = "UPDATE examples.employees SET "
					+ "emp_name=?, emp_title=?, "
					+ "emp_salary=?, login_id=? WHERE emp_id=?";
			ps = conn.prepareStatement(query);

			ps.setString(1, emp.getEmp_name());
			ps.setString(2, emp.getEmp_title());
			ps.setDouble(3, emp.getEmp_salary());
			ps.setInt(4, emp.getLogin_id());
			ps.setInt(5, emp.getEmp_id());

			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}

		return true;
	}

	@Override
	public boolean deleteEmployeeById(Integer id) {
		PreparedStatement ps = null;
		try (Connection conn = ConnectionUtility.getConnection()) {
			String query = "DELETE FROM examples.employees WHERE emp_id=?";
			ps = conn.prepareStatement(query);
			ps.setInt(1, id);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
}
