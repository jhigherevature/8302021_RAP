package access.two;

import access.one.Data;
/*
 * We use the 'extends' keyword to establish inheritance
 */
public class DataChild extends Data {
	public static void main(String[] args) {
		DataChild dc = new DataChild();
		System.out.println(dc.pubString);
		System.out.println(dc.proString);
//		System.out.println(dc.defString); // error - no inheritance
//		System.out.println(dc.priString); // error - no inheritance
		
		Data d = new Data();
		System.out.println(d.pubString);
		/*
		 * When using the protected access modifier, the protected
		 * field/method is not directly accessible outside of the
		 * parent class. Even the child class cannot access this
		 * information directly. Instead we access it as if we wrote
		 * the field/method within the child class, and made it private
		 */
//		System.out.println(d.proString);
	}
}
