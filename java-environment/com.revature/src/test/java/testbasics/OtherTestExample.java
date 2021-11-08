package testbasics;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.revature.basics.Data;
import com.revature.basics.TestingClass;

public class OtherTestExample {

	@InjectMocks
	private TestingClass tc;
	
	@Mock
	private Data d;
	
	@Before
	public void setUp() {
		MockitoAnnotations.openMocks(this);
	}
	
	@Test
	public void testPerformMethodWithEvenInput() {
		Mockito.when(d.checkisOdd(10)).thenReturn(false);
		assertTrue(tc.performWork(10) == 2000);
	}
	
	@Test
	public void testPerformMethodWithOddInput() {
		//What should I have in the next line?
		Mockito.when(d.checkisOdd(1)).thenReturn(true);
		assertTrue(tc.performWork(1) == 15);
	}

}
