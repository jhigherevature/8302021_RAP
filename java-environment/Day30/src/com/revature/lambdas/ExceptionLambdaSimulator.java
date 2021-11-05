package com.revature.lambdas;

public class ExceptionLambdaSimulator {
	public static void main(String[] args) {
		
		/*
		 * When a method declares an exception, we can potentially throw
		 * it in our lambda, as shown below.
		 * 
		 * Things to keep in mind:
		 * 		When a method throws an exception, you must throw an
		 * 		exception that is a child of the exception declared
		 * 		with 'throws' (not a parent, i.e. throw new Exception()
		 * 		would cause an error below)
		 * 
		 * 		When a method has a "throws" declaration that you are
		 * 		overriding, you are not required to throw an exception
		 * 		in the implementation, though it allows you to do so.
		 */
		ExceptionalInterface ei = (check) -> {
			if (check)
				throw new TestException();
			else {
				System.out.println("No problems");
			}
		};
		
		try {
			ei.makeMistake(true);
		} catch (TestException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
