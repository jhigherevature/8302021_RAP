package com.revature.testing;

/*
 * A class which show cases injection via Constructor conventions
 */
public class ConstructorInjection {
	private InjectionClass injection;
	
	public ConstructorInjection(InjectionClass injection) {
		this.injection = injection;
	}
	
	public boolean performAction(int value) {
		return injection.checkValue(value);
	}
}
