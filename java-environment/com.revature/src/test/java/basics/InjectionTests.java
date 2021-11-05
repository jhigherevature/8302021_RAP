package basics;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.revature.testing.ConstructorInjection;
import com.revature.testing.FieldInjection;
import com.revature.testing.InjectionClass;
import com.revature.testing.SetterInjection;

public class InjectionTests {
	/*
	 * the @InjectMocks allows mockito to utilize Mocked objects
	 * within the objects that are annotated with InjectMocks
	 * 
	 * When you have composite relationships between different 
	 * classes the @InjectMocks annotation and Mocked data allow 
	 * you to create the dummy data and method stubs that are 
	 * used within your unit tests
	 * 
	 * When we use the @InjectMocks annotation, Mockito can
	 * provide the injection in the following order:
	 * 		using the class's constructor, 
	 * 		using a setter for the object 
	 * 		accessing the field directly
	 */
	@InjectMocks
	ConstructorInjection conInject;
	
	@InjectMocks
	SetterInjection setInject;
	
	@InjectMocks
	FieldInjection fieldInject;
	
	/*
	 * The @Mock annotation allows us to create dummy objects
	 * (mocks) which Mockito can provide method stubs for, and
	 * control the information that is being returned from
	 * our mocked object, when input is received. Effectively
	 * it allows us to control the input/output of supplementary
	 * objects to our main objects we are testing...
	 */
	@Mock
	InjectionClass classToInject;
	
	@Before
	public void setUp() {
		MockitoAnnotations.openMocks(this);
	}
	
	@Test
	public void constructorTest () {
		Mockito.when(classToInject.checkValue(10)).thenReturn(true);		
		assertTrue(conInject.performAction(10));
	}
	
	@Test
	public void setterTest () {
		Mockito.when(classToInject.checkValue(10)).thenReturn(true);		
		assertTrue(setInject.performAction(10));
	}
	
	@Test
	public void fieldTest () {
		Mockito.when(classToInject.checkValue(10)).thenReturn(true);		
		assertTrue(fieldInject.performAction(10));
	}
}
