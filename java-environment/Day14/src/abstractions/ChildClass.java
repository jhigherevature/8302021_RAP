package abstractions;

/*
 * The first concrete class that inherits from an abstract entity
 * (abstract classes or interfaces) must provide a definition/implementation
 * for every inherited abstract method
 */
public class ChildClass extends AbstractParentClass {
	/*
	 * When overriding an abstract method note that you do not
	 * include the abstract keyword again
	 */
	public void printInfo() {
		System.out.println("Name="+name + " id=" + id+ " amount="+amount);
	}
	
	@Override
	public void doSomethingCool() {
		System.out.println("Rad!");
	}

	@Override
	public void doSomethingElse() {
		// TODO Auto-generated method stub
	}

	@Override
	public void secondMethod() {
		// TODO Auto-generated method stub
	}

	@Override
	public int doSomethingCool(boolean value) {
		// TODO Auto-generated method stub
		return 0;
	}
}
