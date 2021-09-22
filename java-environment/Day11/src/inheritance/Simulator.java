package inheritance;

public class Simulator {
	public static void main(String[] args) {
		Customer c = new Customer("Bob Smith", "123 Main St", "bobS@gmail,com");
		SavingsAccount save = new SavingsAccount(1, c, 100.00, 0.02);
		
		System.out.println(save.owner.getName());
	}
}
