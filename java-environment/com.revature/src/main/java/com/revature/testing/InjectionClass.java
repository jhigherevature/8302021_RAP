package com.revature.testing;

/*
 * A class which will be injected into other classes using Mockito
 * in our test cases.
 */
public class InjectionClass {
	public boolean checkValue(Integer value) {
		if (value > 5)
			return true;
		
		return false;
	}
}
