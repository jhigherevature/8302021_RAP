package operators;

public class UnaryOperators {
	public static void main(String[] args) {
		int post = 10;
		System.out.println(post); // 10
		System.out.println(post++); // 10
		System.out.println(post); // 11
		
		int pre = 10;
		System.out.println(pre); // 10
		System.out.println(++pre); // 11
		
		int value = --pre + post++; // value will be 21
		
		System.out.println(true); // true
		System.out.println(!true); // false
		
		System.out.println(false); // false
		System.out.println(!false); // true
		
		int a = 10;
		int b = 5;		
		System.out.println(a > b); // true
		System.out.println(!(a > b)); // false
	}
}
