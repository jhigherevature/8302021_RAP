package testservices;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.revature.banking.dao.EmployeeDAO;
import com.revature.banking.dao.LoginDAO;
import com.revature.banking.models.Employee;
import com.revature.banking.models.Login;

import services.AuthenticationService;

public class AuthServTest {
	
	@InjectMocks
	private AuthenticationService serv;
	
	@Mock
	private LoginDAO ldao;
	
	@Mock
	private EmployeeDAO edao;

	@Mock
	private Login login;

	@Mock
	private Employee emp;
	
	@Before
	public void setUp() {
		MockitoAnnotations.openMocks(this);
		login = new Login(100, "test", "pass");
		emp = new Employee(99, "test", "CEO", 1000.00, 100);
	}
	
	@Test
	public void authTest() {
		Mockito.when(ldao.selectLoginByUserAndPass("test", "pass")).thenReturn(login);
		Mockito.when(edao.selectEmployeeByLoginId(login.getLogin_id())).thenReturn(emp);
		Employee e = serv.authenticateEmployee("test", "pass");
		assertEquals(e, emp);
	}
}
