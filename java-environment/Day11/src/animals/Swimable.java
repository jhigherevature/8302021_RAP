package animals;

/*
 * Interfaces can provide inheritance to classes as well, but instead
 * of using extends, we use 'implements'.
 * 
 * This is important because, classes can only extend one other class
 * in Java. However, classes can implement multiple interfaces and 
 * interfaces can extend multiple interfaces. 
 */
public interface Swimable {
	public abstract void swim();
}
