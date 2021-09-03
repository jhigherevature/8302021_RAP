package flowcontrol;

public class SwitchStatements {
	public static void main(String[] args) {
		/*
		 * For an equivalent if-statement:
		 * if (x == 3) {
		 * 		System.out.println("X is 3");
		 * } else if (x == 5) {
		 * 		System.out.println("X is 5");
		 * }
		 */
		
		/*
		 * Switch statements exhibit fall-through logic. Without the use
		 * of the 'break' keyword, once a matching case is found in your
		 * switch statement block, you will continue to exeucte the code
		 * within other following case statements, regardless of whether
		 * the case matches your variable's value
		 */
		int x = 12;
		switch (x) {
		default:
			System.out.println("X is not another value listed");
			break;
		case 1:
		case 3:
		case 5:
		case 7:
		case 9:
			System.out.println("X is odd and less than or equal to 9");
			break;
		case 0:
		case 2:
		case 4:
		case 6:
		case 8:
			System.out.println("X is even and less than or equal to 9");
			break;
		}
		
		
		switch (x % 2) {
		case 1:
			System.out.println("X is odd");
			break;
		case 0:
			System.out.println("X is even");
			break;
		}
	}
}
