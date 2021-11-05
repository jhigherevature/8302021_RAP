package basics;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class TestBasics {
	
	/*
	 * A JUnit Test File is simply a Java class which
	 * leverages different JUnit annotations and methods.
	 * 
	 * When resolving the order of execution for a test
	 * file, we will perform the following steps in order:
	 * 
	 * 1 - Test File will be loaded into memory
	 * 		-There is some other work that goes in here, regarding
	 * 			the creation of objects...
	 * 
	 * Afterwards... We will execute methods in order, based
	 * on the annotations provided:
	 * 
	 * 2 - @BeforeClass - This method will be executed
	 * 		-@BeforeClass is used for general test setup
	 * 		-@Before class methods should be static
	 * 
	 * 3 - Create an instance of the Test class 
	 * 
	 * 4 - Invoke the @Before annotated method(s)
	 * 		-@Before is used to perform setup prior to each
	 * 			test that is executed
	 * 
	 * 5 - Invoke the @Test annotated method(s)
	 * 		-These methods are invoked in order that they
	 * 			appear in the test file
	 * 
	 * 6 - Invoke the @After annotated method(s) after
	 * 		each test which is ran
	 * 		-@After is used to perform some sort of 'tear down'
	 * 		 	or cleanup process after each method
	 * 
	 * 7 - After all tests complete the @AfterClass annotated
	 * 		method is executed
	 */
	@BeforeClass
	public static void setUpBeforeClass() {
		System.out.println("Before Class Method");
	}
	
	@AfterClass
	public static void tearDownAfterClass() {
		System.out.println("After Class Method");
	}
	
	@Before
	public void setUp() {
		System.out.println("Before Test");
	}
	
	@After
	public void tearDown() {
		System.out.println("After Test");
	}
	
	@Test
	public void test_1 () {
		System.out.println("Test 1 Ran");
	}
	
	@Ignore
	@Test
	public void test_2 () {
		System.out.println("Test 2 Ran");
	}
}
