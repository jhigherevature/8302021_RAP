package abstractions;

/*
 * Abstract classes cannot be instantiated directly using
 * the abstract classes' constructors
 */
public abstract class AbstractClass implements InterfaceOne, InterfaceTwo, InterfaceThree {
	protected String name;
	protected long id;
	protected double amount;
	
	/*
	 * Abstract methods do not contain a body
	 * 
	 * Abstract methods can only exist within other abstract
	 * entities (abstract classes and interfaces)
	 */
	public abstract void printInfo();
	
	public void performActions() {
		System.out.println("This is a concrete method in an abstract class");
	}
}
