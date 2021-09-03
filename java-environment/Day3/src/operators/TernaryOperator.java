package operators;

public class TernaryOperator {
	/*
	 * Ternary Syntax:
	 * boolean_condition ? expr_returned_when_true : expr_returned_when_false
	 */
	public static void main(String[] args) {
		int x = true ? 99 : 25;
		System.out.println(x); // 99
		x = false ? 99 : 25;
		
		// equivalent to the above
		if (true) {
			x = 99;
		} else {
			x = 25;
		}
		
		System.out.println(x); // 25
		int a = 5;
		int b = 15;
		
		int y = (a > b) ? (x) : (b - a);
		System.out.println((a < b) ? 77.9 : "Programming");
	}
}
