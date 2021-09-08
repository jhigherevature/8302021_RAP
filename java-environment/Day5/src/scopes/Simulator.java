package scopes;

/*
 * Java will import data from 2 locations:
 * 		1 - All Classes from the package this class is declared
 * 		2 - All Classes from the java.lang package within the JRE
 * 
 * Import statements really act as a list of locations that the
 * JVM will search when resolving datatypes within a class.
 * 
 * Fully Qualified Class Name:
 * 		package + class name
 */
import functionality.Dog;

public class Simulator {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.name = "Fido";
		d.breed = "Labrador";
		
		scopes.Dog scopeDog = new scopes.Dog();
		scopeDog.type = "Small";
		scopeDog.weight = 10.2;
	}
}
