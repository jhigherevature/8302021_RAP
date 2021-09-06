package arrays;

public class VarArgs {
	public static void main(String[] args) {
		String[] words = new String[] {"Revature", "Programming"};
		printInfo(words); // "Your input was Revature Programming"
		printWithVarArgs("Apple", "Orange", "Banana", "Pineapple", "Kiwi"); // Your input was Apple Orange
		printWithVarArgs(words);
		
	}
	
	public static void printInfo(String[] word) {
		System.out.println("Your input was: " + word[0] + " " + word[1]);
	}
	
	/*
	 * When using a VarArgs in a method signature (when defining a
	 * method), the VarArgs list MUST be the last parameter of
	 * your parameter list. This means that you can only have a
	 * single VarArgs parameter per method.
	 * 
	 * This does not prevent you from listing other parameters prior
	 * to the VarArgs, however, it does prevent you from listing them
	 * after the varargs.
	 */
	public static void printWithVarArgs(String... words) {
		System.out.println("Your input was: " + words[0] + " " + words[1]);
	}
}
