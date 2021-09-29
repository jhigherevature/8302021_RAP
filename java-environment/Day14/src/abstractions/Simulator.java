package abstractions;

public class Simulator {
	public static void main(String[] args) {
//		AbstractClass ac = new AbstractClass();
//		ac.printInfo();
		
		AbstractClass child = new ChildClass();
		child.printInfo();
	}
}
