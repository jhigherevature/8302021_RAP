package basics;

public class Primitives {
	public static void main(String[] args) {
		/*
		 * Variables are created in Java by stating
		 * the datatype, followed by the var name
		 */
		byte b = 100;
		System.out.println(b);
		
		// b = 128; // 8 bits can only go up to +127 to -128
		
		b = (byte)128;
		System.out.println(b);
		
		char c = 'Z';
		System.out.println(c);
		
		/*
		 * Force Java to treat numeric literals as
		 * a Long, by including the letter 'L' after
		 * the number. Because Java will try to treat
		 * a numeric literal as an int, when you have
		 * a number that is bigger than 32 bits, you must
		 * force it to be treated as a long.
		 * 
		 * Traditionally, you use a capital 'L' not the
		 * lowercase, because lowercase 'l' looks like a
		 * 1
		 */
		long l = 1_000_000_000_000_000_000L;
		
		/*
		 * Decimal point values are treated, by default
		 * as a double, so we can force java to treat
		 * it as a float by including the letter 'f' after
		 * the decimal value
		 */
		float f = 3.14F;
		double d = 3.14;
		
		/*
		 * Java requires you to cast when you are moving
		 * from a larger datatype to a smaller datatype.
		 * 
		 * This is called 'downcasting'
		 */
		int castedD = (int)d;
		/*
		 * Java will implicitly 'upcast' to larger datatypes
		 * from smaller
		 */
		double castedInt = castedD;
		
		
		int hardToRead = 1______00______0;
		int alsoHardtoRead = 1_0_0_0_0;
		
		int hex = 0x2B;
		System.out.println(hex);
	}
}
