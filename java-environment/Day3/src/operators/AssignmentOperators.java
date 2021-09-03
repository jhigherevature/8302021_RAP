package operators;

public class AssignmentOperators {
	public static void main(String[] args) {
		int x = 5;
		System.out.println(x); // 5
		System.out.println(x = 10); // 10
		System.out.println(x); // 10
		
		x += 5;
		System.out.println(x); // 15
		System.out.println(x -= 5); // 10
		
		System.out.println(x *= 5); // 50
		System.out.println(x /= 5); // 10
		
		double a = 10;
		int b = 3;
		System.out.println("With Double and Int: " + (a / b));
		
		int c = 10;
		int d = 3;
		System.out.println("With Int and Int: " + (c / d));
		
		double nine = 9.9999999;
		System.out.println(nine); // 9.999999
		int casted = (int)nine;
		System.out.println(casted); // 9
	}
}
