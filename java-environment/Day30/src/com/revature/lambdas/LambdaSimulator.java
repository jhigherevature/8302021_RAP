package com.revature.lambdas;

public class LambdaSimulator {
	public static void main(String[] args) {
		HelloWorldInterface hwi = new HelloWorldImplClass();
		hwi.printHello();
		
		HelloWorldInterface hLam = () -> {
			System.out.println("Hello World [Lambda]");
		};
		hLam.printHello();
		
		PrintInputInterface pii = (i, v) -> {
			System.out.println("String was : " + i.toLowerCase() 
					+ "Value was: " + (v*5));
		};
	}
}
