package abstractions;

/*
 * Interfaces are abstract entities (similar to abstract classes)
 * The main differences between abstract classes and interfaces are:
 * 	1 - Interface Methods will implicitly be given the following 
 * 		modifiers:
 * 			public
 * 			abstract
 * 
 * 2 - Interface Variables will implicitly be given the following
 * 		modifiers:
 * 			public
 * 			static
 * 			final
 * 
 * 3 - Classes may use the keyword 'implements' to inherit from an
 * 		interface.
 * 			**Classes may implement multiple interfaces!
 * 4 - Interfaces may extend multiple interfaces
 * 5 - Interfaces cannot extend/implement classes
 * 6 - Interfaces (similar to abstract classes) cannot be instantiated
 * 		directly
 * 
 * 7 - Interfaces can contain methods which have a body, when you
 * 		use the keyword "default"
 */
public interface InterfaceOne {
	public abstract void doSomethingCool();

	/*
	 * The keyword 'default' allows for the creation of a concrete method (a method
	 * with a body) in our interface
	 */
	public default void sayHello() {
		System.out.println("Hello World");
	}
}
