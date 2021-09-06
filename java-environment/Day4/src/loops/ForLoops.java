package loops;

public class ForLoops {
	public static void main(String[] args) {
		System.out.println("::: START OF APPLICATION :::");
		/*
		 * For-loops provide us with more nuanced control over
		 * the execution of a repeating structure. There are 3
		 * statements used within a for-loop:
		 * initialization : A statement that runs one time 
		 * 		prior to executing our loop. 
		 * condition : A boolean statement that will be checked
		 * 		prior to executing our loop during each cycle.
		 * 		If the boolean is true, we will repeat our functionality
		 * 		if it is false, we will break out of our loop 
		 * modification : A statement that will execute at the end
		 * 		of each loop cycle. This is usually used to manipulate
		 * 		a variable created in the initialization statement to
		 * 		insure that we break out of our loop eventually.
		 *
		 *	for (intialization; condition; modification) { }
		 */
		for (int x = 0; x < 10; x++) {
			System.out.println(x);
		}
		
		for (int y = 3; y == 3; y = 15) {
			System.out.println("Y is: " + y);
			System.out.println("This loop runs once!");
		}
		
		for (int z = 10; z > 0; z-=2) {
			System.out.println(z);
		}
		
		
		System.out.println("::: END OF APPLICATION :::");
	}
}
