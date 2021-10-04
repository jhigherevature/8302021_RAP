package exceptions;

public class Simulator {
	public static void main(String[] args) {
		/*
		 * try {
		 * 		Code-to-execute 
		 * } catch (Exception-to-catch) {
		 * 		code-to-occur-when-exception-caught
		 * } catch (Exception-2-to-catch {
		 * 		code-to-occur-when-exception-2-caught
		 * } ...
		 */
//		try {
//			System.out.println(sumDifferentOddNumbers(1,1));
//		} catch (EvenNumberException e) {
//			doSomethingElse();
//		} catch (DuplicateInputException d) {
//			d.printStackTrace();
//			System.exit(0);
//		} finally {
//			/*
//			 * Finally blocks within a try-catch block will almost
//			 * ALWAYS execute...
//			 * 
//			 * The only situations in which a finally block will not
//			 * execute are:
//			 * 	-Critical system failures (if you turn off your computer)
//			 * 	-When you invoke the System.exit(0) method
//			 */
//			System.out.println("I will (almost) always execute!");
//		}
		
		/*
		 * Even in very critical errors (like stack overflow)
		 * the finally block will still execute!
		 */
		try {
			recursive(5);	
		} finally {
			System.out.println("This will still execute!");
		}
		
	}
	
	public static void recursive(int a) {
		System.out.println(a);
		recursive(a);
	}
	
	
	public static void doSomethingElse() {
		System.out.println("Looks like something went wrong");
		System.out.println("So I just give up instead");
	}
	
	/*
	 * If you throw an exception somewhere in the body of a
	 * method, you must handle that exception in one of two ways:
	 * -Surround with a try-catch block
	 * -"Duck" the exception, by using the "throws"  declaration
	 */
	public static int addOddNumbers(int a, int b) 
			throws EvenNumberException {
		if (a % 2 == 0) {
			throw new EvenNumberException("Input one was even!");
		}
		
		if (b % 2 == 0) {
			throw new EvenNumberException("Input two was even!");
		}
		
		return a + b;
	}
	
	public static int sumDifferentOddNumbers(int a, int b) 
			throws EvenNumberException, DuplicateInputException {
		if (a % 2 ==0 || b % 2 == 0) {
			throw new EvenNumberException("Even number detected!");
		}
		
		if (a == b) {
			throw new DuplicateInputException();
		}
		
		return a + b;
	}
	
	/*
	 * Overloaded methods can throw a different list of exceptions
	 */
	public static void addOddNumbers() {
		
	}
}
