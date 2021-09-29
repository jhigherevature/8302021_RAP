package abstractions;

public interface InterfaceThree {
	/*
	 * This will cause an error if you implement this interface along
	 * with interfaceOne with the following method definition, because
	 * the only difference between the two methods are the return type
	 * there is no way to distinguish between them!
	 */
//	public int doSomethingCool();
	
	public int doSomethingCool(boolean value);
}
