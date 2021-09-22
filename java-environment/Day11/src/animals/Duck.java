package animals;

public class Duck extends Bird implements Flyable, Swimable {
	/*
	 * We can override (change the behavior of inherited methods)
	 * the methods received from our parent class or interfaces!
	 */
	public void fly() {
		System.out.println("To migrate");
	}
	
	public void swim() {
		System.out.println("I like ponds and lakes");
	}
	/*
	 * You can override inherited methods. To do so, you must
	 * match the method signature of the parent class method
	 * (there are some slight modifications you can make)
	 */
	public String toString() {
//		return "Daffy Hates Buggs";
		return "Duck [type=" + this.type + ", weight=" + this.weight + "]";
	}
}
