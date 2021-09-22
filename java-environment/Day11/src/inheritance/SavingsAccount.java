package inheritance;

/*
 * Extends establishes an inheritance heirarchy between entities (classes)
 */
public class SavingsAccount extends Account {
	public double amount;
	public double interestRate;
	
	/*
	 * Java will perform constructor chaining when creating objects
	 * Constructor chaining is an invocation of super class constructors
	 * within a child class to ensure that we have access to all fields
	 * and methods of parent classes throughout our inheritance heirarchy.
	 * 
	 * Constructor chaining will continue until the Object class constructor
	 * is called
	 */
	public SavingsAccount(long id, Customer owner, double amount, double interestRate) {
		super(id, owner);
		this.amount = amount;
		this.interestRate = interestRate;
		System.out.println("Savings Account Class Constructor");
	}
}
