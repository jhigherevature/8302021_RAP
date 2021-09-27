package animals;

public class Platypus extends Mammal {
	public void poison() {
		System.out.println(name + " used back talon to poison foe");
	}

	/*
	 * Overloaded
	 */
	public void generateBodyHeat(int degrees) {
		System.out.println(name + "is now: " + degrees + " warmer");
	}
}
