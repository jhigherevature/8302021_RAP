package strings;

public class StringSimulator {
	public static void main(String[] args) {
		String word = "Hello";
		word = word + "s"; // Not placed in String pool
		System.out.println(word); // "Hellos"
		String other = "Hellos"; // placed into String pool
		System.out.println(other); // "Hellos"
		System.out.println(word == other); // false
		
		String third = "Hellos";
		
		/*
		 * Strings in Java exhibit 'pooling' behavior.
		 * There is a special allocation of memory in our
		 * Heap known as the "String pool". When we create
		 * String literals (Strings created directly, not as
		 * the result of a method or operation), the String
		 * literals are placed within the String pool, and
		 * any Strings that share the same values in the String
		 * pool are consolidated
		 */
		// the String class in Java already overrides the equals method
		System.out.println(word.equals(other)); // true
		
		System.out.println(other == third); // pooled literals
	}
}
