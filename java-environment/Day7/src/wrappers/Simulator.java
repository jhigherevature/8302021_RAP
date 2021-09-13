package wrappers;

public class Simulator {
	public static void main(String[] args) {
		/*
		 * Wrapper classes allow you to treat a primitive as if
		 * it were an object. Java provides a wrapper for each
		 * of the 8 primitive types.
		 * 
		 * Java also automatically converts between object and 
		 * the respective primitive representations for these variables
		 * Autoboxing - converting from a primitive to a wrapper
		 * (Auto)Unboxing - converting from a wrapper to a primitive 
		 */
		int num = 100;
		// autoboxing
		Integer number = num;

		// unboxing
		int other = number;
	}
}
