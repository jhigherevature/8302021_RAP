package inheritance;

public class Account {
	protected long id;
	protected Customer owner;
	
	public Account (long id, Customer owner) {
		this.id = id;
		this.owner = owner;
		System.out.println("Account Class Constructor");
	}
}
