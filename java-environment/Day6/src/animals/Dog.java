package animals;

public class Dog {
	public int id;
	public String name;
	public String breed;
	public int age;
	public double weight;
	
	/*
	 * Constructors are special methods* (in actuality a constructor
	 * is a subroutine, but you don't need to know that...) that
	 * are used when creating an object
	 * 
	 * If you do not provide your own constructor definition, Java
	 * will provide you with a default (no-args) constructor.
	 * This constructor takes no arguments (declares no parameters)
	 * and effectively does nothing.
	 */
	
	/*
	 * The following showcases three (3) overloaded constructors
	 * for the Dog class. They can be distinguished based on the 
	 * different parameter lists in each constructor
	 */
	public Dog(String name, String breed, int age, double weight) {
		/*
		 * If you do not use the 'this' keyword, then a variable, whose
		 * name matches a field in java will overshadow that field.
		 * This is known as 'variable shadowing'
		 */
		this.name = name;
		this.breed = breed;
		this.age = age;
		this.weight = weight;
		this.id = AnimalIdCreator.getNewId();
	}
	public Dog(String name, String breed) {
		this(name, breed, 0, 0);
	}
	public Dog() {
		// calling the fully parameterized constructor
		this("n/a", "n/a", 0, 0);
	}
	
	public void bark() {
		System.out.println("Woof Woof");
	}
}
