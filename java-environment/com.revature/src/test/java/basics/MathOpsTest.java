package basics;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.revature.testing.MathOps;

public class MathOpsTest {
	private MathOps ops;
	
	@Before
	public void setUp() {
		System.out.println("Before Test");
		ops = new MathOps();
	}
	
	@Test
	public void testAdd_01 () {
		System.out.println("Adding Test 01");
		int result = ops.add(1, 2);
		assertTrue(result == 3);
	}
	
	@Test
	public void testAdd_02 () {
		System.out.println("Adding Test 02");
		int result = ops.add(5, 5);
		assertTrue(result == 10);
	}
}
