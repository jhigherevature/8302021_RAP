package com.revature.testing;

/*
 * A class which show cases Injection using setter method conventions
 */
public class SetterInjection {
	private InjectionClass injection;
	
	public boolean performAction(int value) {
		return injection.checkValue(value);
	}
	
	public void setInjection(InjectionClass injection) {
		this.injection = injection;
	}
}
