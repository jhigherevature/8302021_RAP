package arrays;

public class CreatingArrays {
	public static void main(String[] args) {
		/*
		 * There are 3 methods we can use to create an array
		 */
		// method 1 : Create an 'empty' array
		int[] one = new int[1];
		
		// method 2 : Create an array and place values within it
		int[] two = new int[] {1,2,3,4,5};
		
		// method 3 : Anonymous array assignment:
		int[] three = {9,8,7,6,5,4};
		
		/*
		 * Note that anonymous array assignment, unlike our other
		 * methods, will only work when you create/declare the
		 * array reference variable on the same line!
		 */
		one = new int[] {5,6,7,8};
		two = new int[5];
//		three = {10,11,12}; // error
		
		int four[] = {10,11,12};
		
		String[] words = new String[] {"Hello", "There", "Programming"};
		
		Object[] objs = new Object[4];
		
		Dog[] dogs = new Dog[2];
		dogs[0] = new Dog("Golden Retriever");
		dogs[1] = new Dog("Blue Heeler");
		
		dogs = new Dog[] {new Dog("Labrador"), new Dog("Dalmation")};
		
		Dog fido = new Dog("White Lab");
		Dog scooby = new Dog("Great Dane");
		dogs = new Dog[] {fido, scooby};
	}
}
