package finalKeyword;

/*
 * Variables declared with Final keyword must initialize the variable
 * with a value either on the line the variable is declare, or within
 * the constructor
 */
public class FinalKeyword {
	public final String name;
	
	public final String filePath = "C:/Users/JosephHighe/file.txt";
	
	public FinalKeyword(String name) {
		this.name = name;
	}
	
	public /*abstract*/ final void method() {
		System.out.println("You cannot override me!");
	}
}
