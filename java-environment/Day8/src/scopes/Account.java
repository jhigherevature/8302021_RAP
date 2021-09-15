package scopes;

public class Account {
	/*
	 * Instance Scope : Variables (and methods) that exist so 
	 * long as the object exists in memory
	 */
	public int id;
	public String accountHolderName;
	public double amount;
	
	/*
	 * Static scope : Variables (and methods) that exist throughout
	 * the lifetime of our application/class loaded into memory
	 */
	public static int count;
	
	public Account (int id, String accountHolderName, double amount) {
		this.id = id;
		this.accountHolderName = accountHolderName;
		this.amount = amount;
		count++;
	}
	
	public Account() { }
	
	public static void doSomething() {
		System.out.println("Do Something method");
		Account acc = new Account();
		acc.method();
		
		new Account().method();
	}
	
	/*
	 * Method scope variables exist within out methods!
	 * 
	 * Method and Block scope are also referred to as 'local'
	 * variables
	 */
	public void method() {
		/*
		 * Variable Shadowing (recap) : The most recently declared
		 * variable within respect to our method will be used when
		 * there we reuse an instance/class variable name inside
		 * of our method
		 */
		int id = 2000;
		System.out.println(id);
		System.out.println(this.id);
		double count = 99.9;
		System.out.println(count);
		System.out.println(this.count);
		
		int temp = 100;
		System.out.println(temp);
		
		/*
		 * Block scope variables exist within flow control statements
		 * that are nested within our methods
		 */
		if (temp > 50) {
//			int id = 10; // error - reused variable name in method
			String phrase = "Temp is greater than 50";
			System.out.println(phrase);
		}
//		System.out.println(phrase); // block scope - not accessible outside if-statement
	}
}
