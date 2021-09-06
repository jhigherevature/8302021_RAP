package arrays;

public class Basics {
	public static void main(String[] args) {
		// Arrays in Java are fixed in size/length
		int[] numbers = new int[5];
		
		// You can still reassign an array ref variable
		numbers = new int[3];
		
		/*
		 * The index of an array is the numerical position
		 * for information that exists within our array.
		 * Array indexing (for 99% of computers languages
		 * including java) start at 0.
		 * 
		 * Syntax:
		 * arrayName[index]
		 */
		numbers[0] = 100;
		numbers[1] = 200;
		numbers[2] = 300;
		
		System.out.println(numbers[0]); // 100
		int sum = numbers[1] + numbers[2];
		System.out.println(sum); // 500
		
//		numbers[3] = 1; // array index out of bounds exception
		
		/*
		 * Arrays have certain properties, such as 'length'
		 * which will return the number of elements (data that
		 * can be placed within the array) that the array can
		 * hold.
		 * 
		 * Since array indexing starts at 0, the last index
		 * of an array is always 1 less than the length of the
		 * array
		 */
		System.out.println("Array length: " + numbers.length); // 3
		System.out.println("Array last index: " + (numbers.length - 1)); // 2
		
	}
}
