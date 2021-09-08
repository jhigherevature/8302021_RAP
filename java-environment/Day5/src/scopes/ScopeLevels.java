package scopes;

public class ScopeLevels {
	public static void main(String[] args) {
		String mainMethodString = "Main";
		/*
		 * Block Scope : Definition of variables within a flow-control
		 * statement.
		 */
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
			String word = "Programming";
		}
		/*
		 * The variable i (and any other variable created
		 * in our for loop) exists within the block scope
		 * of our for loop. Once you exit a lower scope the
		 * variables created within that scope are no longer
		 * accessible.
		 */
//		System.out.println(i);
//		System.out.println(word);
		
	}
	
	/*
	 * Method Scope variables are ones that are created within
	 * the context of a method. These are lost when the method
	 * has finished execution.
	 */
	public static void method() {
		String methodScopeVar = "Hello There";
//		System.out.println(mainMethodString);
	}
}
