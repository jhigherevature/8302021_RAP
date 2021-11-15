package com.revature.lambdas;

public class FlyableLambdaSimulator {
	public static void main(String[] args) {
		Flyable bird = new Bird();
		performFlyFunctionality(bird);
		
		performFlyFunctionality( 
			() -> { System.out.println("This also invoked Correctly!"); }
		);
	}
	
	public static void performFlyFunctionality(Flyable flyer) {
		flyer.fly();
	}
}
