package com.revature.lambdas;

/*
 * Functional Interfaces are interfaces which only declare a
 * single abstract method.
 * 
 * The @FunctionalInterface annotation is a convenience annotation
 * which can help communicate the intention and prevent errors by
 * provide compilation exceptions when multiple abstract methods 
 * are present.
 */
@FunctionalInterface
public interface HelloWorldInterface {
	// the 'abstract' keyword is implied in interfaces
	public /*abstract*/ void printHello();
	
//	public void doSomethingElse();
	
	public default void alreadyImplemented() {
		System.out.println("This is a default method. Doesnt prevent this"
				+ "interface from being functional");
	}
}
