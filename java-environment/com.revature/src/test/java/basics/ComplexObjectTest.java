package basics;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.revature.testing.ComplexTest;
import com.revature.testing.Data;

public class ComplexObjectTest {
	@InjectMocks
	ComplexTest ct;
	
	@Mock
	private Data d;
	
	@Before
	public void setUp() {
		MockitoAnnotations.openMocks(this);
	}
	
	@Test
	public void TestWhenNumberIsOdd() {
		Mockito.when(d.checkisOdd(9)).thenReturn(true);
		assertTrue(ct.performComplexCheck(9).equals("Number is odd"));
	}
	
	@Test
	public void TestWhenNumberIsGreaterThanTen() {
		Mockito.when(d.checkisOdd(20)).thenReturn(false);
		assertTrue(ct.performComplexCheck(20).equals("Greater than 10"));
	}
}
