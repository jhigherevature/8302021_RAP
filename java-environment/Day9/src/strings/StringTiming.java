package strings;

public class StringTiming {
	public static void main(String[] args) {
		System.out.println("::: START OF APPLICATION :::");
		int count = 300_000;
		createManyStrings(count);
		createWithStringBuilder(count);
		createWithStringBuffer(count);
		System.out.println("::: END OF APPLICATION :::");
	}
	
	public static void createManyStrings(int n) {
		String s = "";
		long start = System.currentTimeMillis();
		for (int i = 0; i < n; i++) {
			s += "a";
		}
		long end = System.currentTimeMillis();
		System.out.println("ManyStrings took: " + (end - start) + "ms");
	}
	
	public static void createWithStringBuilder(int n) {
		StringBuilder sb = new StringBuilder("");
		long start = System.currentTimeMillis();
		for (int i = 0; i < n; i++) {
			sb.append("a");
		}
		long end = System.currentTimeMillis();
		System.out.println("StringBuilder took: " + (end - start) + "ms");
	}
	
	public static void createWithStringBuffer(int n) {
		StringBuffer sb = new StringBuffer("");
		long start = System.currentTimeMillis();
		for (int i = 0; i < n; i++) {
			sb.append("a");
		}
		long end = System.currentTimeMillis();
		System.out.println("StringBuffer took: " + (end - start) + "ms");
	}
}
