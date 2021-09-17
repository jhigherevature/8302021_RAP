package scanner;

import java.util.Scanner;

/*
 * By default, the scanner classes uses whitespaces as the delimiter for
 * your input tokens.
 * 
 * However, the nextLine() method for scanners uses a new line character
 * instead!
 */
public class ScanSimulator {
	public static void main(String[] args) {
		System.out.println("::: START OF APPLICATION :::");
		Scanner scan = new Scanner(System.in);
		System.out.println("Give me input:");
		String input_1 = scan.next();
		System.out.println("Your input was: " + input_1);

		
		
		/*
		 * Keep in mind that the methods for scanner are type-sensitive
		 * based on the source for the Scanner's input stream.
		 * 
		 * If we detect a different datatype than a method is expecting
		 * an InputMismatchException will be thrown.
		 * 
		 * Note that moreorless all values can be convered to a String
		 * in Java (scan.next(); is generally safe)
		 */
		
		Scanner scan2 = new Scanner(System.in);
		int input_2 = scan2.nextInt();
		System.out.println("Your Number was: " + input_2);
		
		
		/*
		 * Use a loop with the 'hasNext' method to read values
		 * from the scanner until the end of the input
		 */
//		while (scan.hasNext()) {
//			input_1 = scan.next();
//			System.out.println(input_1);
//		}
		
		
		/*
		 * Use nextLine() and split() to read an entire sentence
		 * then use the split() method for strings to convert
		 * the sentence to an array of Strings which can be parsed
		 */
//		String rest = scan.nextLine();
//		System.out.println("The rest of the line was: " + rest);
		
		System.out.println("::: END OF APPLICATION :::");
		
		/*
		 * Always close the scanner at the end of your program
		 * when you know you will no longer need it.
		 */
		scan.close();
	}
}
