package animals;

public class Simulator {
	public static void main(String[] args) {
		/*
		 * Anytime you see the 'new' keyword, know that
		 * an object is being created by Java!
		 */
		Dog d = new Dog("Brian", "White Lab", 7, 50.0);
		
		/*
		 * dot notation allows you to access visible fields and
		 * methods on a reference variable
		 */
//		d.name = "Brian";
//		d.breed = "White Lab";
//		d.age = 7;
//		d.weight = 50.0;
		
		System.out.println(d.name);
		d.bark();
		
		Dog daisy = new Dog("Daisy", "Golden Retriever", 3, 100.0);
		System.out.println("Name: " + d.name + " id: " + d.id);
		System.out.println("Name: " + daisy.name + " id: " + daisy.id);
	}
}
