package strings;

public class StringMethods {
	public static void main(String[] args) {
		String sentence = "Hi my name is Joseph. I like programming";
		String upper = sentence.toUpperCase();
		System.out.println(upper);
		System.out.println(sentence);
		System.out.println(upper.equals(sentence));
		System.out.println(upper.equalsIgnoreCase(sentence));
		
		System.out.println(sentence.charAt(8));
		System.out.println(sentence.indexOf("e"));
		System.out.println(sentence.indexOf("e", 10));
		System.out.println(sentence.indexOf("z"));
		
		String fruit = "Apple";
		String objFruit = new String("Apple");
//		objFruit = objFruit.intern(); // change String object to literal memory address
		System.out.println(fruit == objFruit); // false
		System.out.println(fruit == objFruit.intern()); // true

		/*
		 * Parsing : Looking at individual components of a larger set
		 * of data and gleaning important information from those
		 * parts.
		 * 
		 * Using the split method, we can easily slice a larger string
		 * into smaller string (the split method provides an Array of 
		 * String objects). When using split, we declare a delimiter
		 * and this delimiter is not included within the objects that
		 * are returned
		 */
		String otherSentence = "Revature can teach you how to Program!";
		String[] split = otherSentence.split("e");
		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
		}
	}
}
