package services;



import com.revature.banking.dao.EmployeeDAO;
import com.revature.banking.dao.LoginDAO;
import com.revature.banking.models.Employee;
import com.revature.banking.models.Login;

/*
 * Service-oriented architecture (SAO) is a design pattern
 * wherein business logic, pertaining to distinct and discrete
 * actions, is provided by dedicated service members to other
 * components of an application
 * 
 * SAO applies additional layers of abstraction for business
 * activity with the goal of achieving more complex functionality
 * without adding additional complexity to existing members which
 * perform specific, basic actions.
 */
public class AuthenticationService {
	
	
	private LoginDAO ldao;
	private EmployeeDAO edao;
	
	private Login login = null;
	private Employee emp = null;
	
	public Employee authenticateEmployee(String user_name, String user_pass) {
		System.out.println("Authentication Service called on: " + user_name + " " + user_pass);

		login = ldao.selectLoginByUserAndPass(user_name, user_pass);
		
		if (login != null)
				emp = edao.selectEmployeeByLoginId(login.getLogin_id());
		else 
			System.out.println("Login Failed!");
		
		return emp;
	}
}
