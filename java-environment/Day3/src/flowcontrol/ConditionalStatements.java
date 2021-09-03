package flowcontrol;

public class ConditionalStatements {
	public static void main(String[] args) {
		System.out.println("::: START OF APPLICATION :::");
		int x = 10;
		if (x < 0) {
			System.out.println("X is less than Zero");			
		} else if (x == 5) {
			System.out.println("X is 5");
		} else if (x > 3) {
			System.out.println("X is greater than 3");
			if (x % 2 == 0) {
				System.out.println("X is even");
			} else {
				System.out.println("X is odd");
			}
		}
		
		System.out.println("::: END OF APPLICATION :::");
	}
}
