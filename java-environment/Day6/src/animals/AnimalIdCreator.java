package animals;

public class AnimalIdCreator {
	public static int currentId;
	
	public AnimalIdCreator() {
		currentId = 0;
	}
	
	public static int getNewId() {
		currentId++;
		return currentId;
	}
}
