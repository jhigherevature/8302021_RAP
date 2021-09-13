package access.two;

/*
 * Import statements are used to tell java where to 'look' for 
 * information when a class/datatype is declared. By default
 * java will look in 2 places:
 * 		[optional import]
 * 		Current package
 * 		java.lang package
 */
import access.one.Data;

public class Simulator {
	public static void main(String[] args) {
		Data d = new Data();
		System.out.println(d.pubString);
		
//		System.out.println(d.proString); // error
//		System.out.println(d.defString); // error
//		System.out.println(d.priString); // error
		
		DataChild dc = new DataChild();
		System.out.println(dc.pubString);
//		System.out.println(dc.proString);
	}
}
