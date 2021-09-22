package animals;

public class Penguin extends Bird implements Swimable {
	public void swim() {
		System.out.println("Near the south pole");
	}

	/*
	 * Annotations are meta-data tags that can be applied to
	 * methods, classes, variables, interfaces in our programs
	 * which also may have a programmatic implication, which can
	 * limit functionality, initialize a value, or even pass data
	 * that is received
	 */
	@Override
	public String toString() {
		return "Penguin [type=" + type + ", weight=" + weight + "]";
	}
}
