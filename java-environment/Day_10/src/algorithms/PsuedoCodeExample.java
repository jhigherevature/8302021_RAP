package algorithms;

public class PsuedoCodeExample {
	
	/*
	 * Input: array of ints
	 * Output: none to program 
	 * printing odds to the console 
	 * 
	 * if array is not null
		for each element of array
			if value in the array at the current index is odd	
				print value of array at the index
	 */
	public static void printOdds(int[] numbers) {
		if(numbers != null) {
			for(int index = 0; index < numbers.length; index++) {
				// Is the current element odd?
				// how do you get your current element?
				// how do you check if something is odd?
				if(numbers[index] % 2 != 0) { // == 1 is also correct
					//Print out the element
					System.out.println(numbers[index]);
				}
			}
		}
	}
	
	public static void printOddsUsingEnhancedFor(int[] numbers) {
		if(numbers != null) {
			for(int element : numbers) {
				if(element % 2 != 0) { // == 1 is also correct
					//Print out the element
					System.out.println(element);
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		int[] arr = {2,3,4,5,7,9};
		printOdds(arr); 
		System.out.println("Using enhanced for loop");
		printOddsUsingEnhancedFor(arr);
	}
	
}
