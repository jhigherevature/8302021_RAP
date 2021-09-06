package loops;

public class IteratingOverCollections {
	public static void main(String[] args) {
		String[] words = {"Apple", "Banana", "Cantalope"};
		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
		}
		
		/*
		 * Enhanced for-loops are used to traverse through an
		 * 'iterable' object. Note that not every object is 
		 * inherently Iterable in Java. Only those that implement
		 * the Iterable interface (more on Iterable and interfaces
		 * later...)
		 * If you have an interable object (such as an Array), then
		 * you can use the enhanced for-loop syntax:
		 * 	
		 * 		for (Datatype varName : Collection) { }
		 * 
		 * Note: the 'Datatype' must match the type in the collection 
		 */
		for (String word : words) {
			System.out.println(word);
		}
		
		String input = "Input";
//		for (char c : input) { // String does not implement Iterable...
//			
//		}
		
		for (int i = 0; i < input.length(); i++) {
			System.out.println(input.charAt(i));
		}
		
	}
}
