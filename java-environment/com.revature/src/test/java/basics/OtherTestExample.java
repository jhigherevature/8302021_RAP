package basics;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.revature.testing.Data;
import com.revature.testing.TestingClass;

/*
 * Mocking - Creating entities in your program that you can specifically
 * control the output of based on input parameters... (this is how we
 * establish "assumptions for output" when manually checking functionality
 */
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
	public void testPerformMethod_01() {
		Mockito.when(d.checkisOdd(10)).thenReturn(false);
		assertTrue(tc.performWork(10) == 2000);
	}
}
