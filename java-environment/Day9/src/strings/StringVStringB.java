package strings;

public class StringVStringB {
	public static void main(String[] args) {
		String word = "Pine";
		word = word.concat("apple");
		System.out.println(word); // Pineapple
		
		StringBuilder sb = new StringBuilder("Pine");
		sb.append("apple");
		System.out.println(sb); // Pineapple
		
		sb.insert(4, "--INSERTED--");
		System.out.println(sb);
		
		sb.insert(0, "PRE-");
		System.out.println(sb);
	}
}
