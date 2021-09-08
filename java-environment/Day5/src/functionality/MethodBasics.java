package functionality;

public class MethodBasics {
	public static void main(String[] args) {
		// Invoking a method : call name of method, and give appropriate arguments
		int sum = addValues(giveFive(),10);
		System.out.println(sum);
		
		Dog d = new Dog();
		d.bark();
	}
	
	/*
	 * Below we are declaring a method called 'addValues'
	 * 
	 * This method takes 2 parameters (int x, int y)
	 * This method returns an int value
	 * This method was declared as 'static'. More on this later...
	 */
	public static int addValues(int x, int y) {
		return x + y;
	}
	
	public static int giveFive() {
		int ret = giveOther(5);
		return ret;
	}
	
	public static int giveOther(int value) {
		return value;
	}
}
