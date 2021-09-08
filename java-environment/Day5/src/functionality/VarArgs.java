/*
 * Other than code comments, package declaration should 
 * be first line of your java file!
 */
package functionality;

public class VarArgs {

	public static void main(String... args) {
		String[] words = {"Hello", "My", "Name", "Is", "Joseph"};
		// VarArgs do NOT replace arrays. But rather give us more 
		// flexibility when trying to use array structures as part
		// of a method's signature
//		String... otherWords = "Hello", "My", "Name", "Is", "Joseph";
		method(words);
		varArgsMethod(words);
		varArgsMethod("Hello", "My", "Name", "Is", "Joseph");
	}
	
	public static void method(String[] input) {
		System.out.println("Takes Array");
		for (int i = 0; i < input.length; i++) {
			System.out.println(input[i]);
		}
	}
	
	public static void varArgsMethod(String... words) {
		System.out.println("Takes Var Args");
		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
		}
	}
}
