package abstractions;

/*
 * Functional Interfaces only contain a single abstract method. Note
 * that they may contain multiple default methods as well...
 */

@FunctionalInterface
public interface FuncInter {
	public abstract void action();
	
	public default int add(int a, int b) {
		return a + b;
	}
	
	public default double divide(double x, double y) {
		return x / y;
	}
}
