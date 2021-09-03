package operators;

public class LogicalOperators {
	public static void main(String[] args) {
//		System.out.println(printAndReturnTrue() & printAndReturnTrue()); // true
//		System.out.println(printAndReturnTrue() & printAndReturnFalse()); // false
		System.out.println(printAndReturnFalse() & printAndReturnTrue()); // false
//		System.out.println(printAndReturnFalse() & printAndReturnFalse()); // false
		
		System.out.println("SHORT-CIRCUIT:");
		System.out.println(printAndReturnFalse() && printAndReturnTrue()); // false
		
//		System.out.println(true | true); // true
//		System.out.println(true | false); // true
//		System.out.println(false | true); // true
//		System.out.println(false | false); // false
//		
//		printAndReturnTrue();
//		printAndReturnFalse();
	}
	
	public static boolean printAndReturnTrue() {
		System.out.println("RETURNS TRUE!!");
		return true;
	}
	
	public static boolean printAndReturnFalse() {
		System.out.println("RETURNS FALSE!!");
		return false;
	}
}
