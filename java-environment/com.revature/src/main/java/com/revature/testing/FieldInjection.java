package com.revature.testing;

/*
 * A class which show cases injection via fields
 */
public class FieldInjection {
	private InjectionClass injection;
	
	public boolean performAction(int value) {
		return injection.checkValue(value);
	}
}
