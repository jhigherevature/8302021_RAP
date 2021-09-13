package comparing;

public class Simulator {
	public static void main(String[] args) {
		int i = 10;
		int j = 10;
		// compare info within variables
		System.out.println(i == j);
		
		CompareObject co_1 = new CompareObject();
		System.out.println(co_1.value);
		CompareObject co_2 = new CompareObject();
		System.out.println(co_2.value);

		/*
		 * The '==' operator compares memory addresses. Java
		 * provides the .equals() method in the Object class
		 * so that you can provide your own definition of 
		 * equivalency in the objects that you create
		 */
		// compare memory address (hashcode)
		System.out.println(co_1 == co_2); // false
		
		CompareObject co_3 = co_1;
		System.out.println(co_1 == co_3); // true
		
		System.out.println(co_1);
		System.out.println(co_2);
	}
}
