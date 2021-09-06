package loops;

public class WhileLoop {
	public static void main(String[] args) {
		System.out.println("::: START OF APPLICATION :::");
		/*
		 * A while loop checks the condition BEFORE executing
		 * code associated with the loop.
		 * 
		 * A do-while loop checks the condition AFTER executing
		 * code associated with the loop.
		 */
		System.out.println("WHILE LOOP:");
		int x = 100;
		while(x < 10) {
			System.out.println(x);
			x++;
		}
		
		System.out.println("DO-WHILE LOOP:");
		int y = 100;
		do {
			System.out.println(y++);
		} while (y < 10);
		
		System.out.println("::: END OF APPLICATION :::");
	}
}
