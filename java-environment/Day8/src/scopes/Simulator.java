package scopes;

public class Simulator {
	public static void main(String[] args) {
		Account acc = new Account(1001, "Joseph", 100.0);
		System.out.println(acc.id);
		System.out.println(Account.count);
	}
}
