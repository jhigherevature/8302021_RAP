package recursion;

/*
 * Recursion : A method of repeating code specifically by structing
 * a function/method to invoke itself somewhere in the body of that
 * method.
 */
public class RecursionExample {
	public static void main(String[] args) {
		System.out.println("FOR LOOP:");
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		System.out.println("RECURSIVE METHOD:");
		printToTen(0);
	}
	
	/*
	 * The following is an infinite loop in recursion
	 * while (true) { }
	 */
	public int recursiveMethod(int i) {
		return recursiveMethod(i);
	}
	
	public static void printToTen(int c) {
		if (c == 10)
			return; // return to stop the functionality
		else {
			System.out.println(c);
			c = c+1;
			printToTen(c);
		}
	}
}
