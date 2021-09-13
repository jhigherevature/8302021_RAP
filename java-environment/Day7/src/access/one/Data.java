package access.one;

public class Data {
	/*
	 * The public access modifier allows information to be visible
	 * anywhere in your project
	 */
	public String pubString = "Public Access";
	
	/*
	 * The protected access modifier acts similar to default access
	 * however, we also grant access to subclasses outside of the
	 * package in which the protected access modifier is used 
	 */
	protected String proString = "Protected Access";
	
	/*
	 * Default/package-private access prevents you from accessing
	 * a field/method outside of the package in which the class
	 * the field/method is created
	 */
	String defString = "Package-Private/Default Access";
	
	/*
	 * The private access modifier prevents you from accessing a
	 * field/method outside of the class that it is declared
	 */
	private String priString = "Private Access";
	
	public static void main(String[] args) {
		Data d = new Data();
		System.out.println(d.pubString);
		System.out.println(d.proString);
		System.out.println(d.defString);
		System.out.println(d.priString);
	}
	
	public void printStrings() {
		System.out.println(this.pubString);
		System.out.println(this.proString);
		System.out.println(this.defString);
		System.out.println(this.priString);
	}
}
