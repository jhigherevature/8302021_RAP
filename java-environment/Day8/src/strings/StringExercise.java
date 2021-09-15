package strings;

public class StringExercise {
	public static void main(String[] args) {
		System.out.println(countVowels_1("supercalifragilisticexpialidocious"));
		System.out.println(countVowels_2("supercalifragilisticexpialidocious"));
	}

	public static int countVowels_1(String phrase) {
		int count = 0;
		phrase = phrase.toLowerCase();
		for (int i = 0; i < phrase.length(); i++) {
			if (phrase.charAt(i) == 'a' 
					|| phrase.charAt(i) == 'e' 
					|| phrase.charAt(i) == 'i' 
					|| phrase.charAt(i) == 'o'
					|| phrase.charAt(i) == 'u') {
				count++;
			}
		}

		return count;
	}

	public static int countVowels_2(String phrase) {
		int count = 0;
		phrase = phrase.toLowerCase();
		for (int i = 0; i < phrase.length(); i++) {
			switch (phrase.charAt(i)) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;
				break;
			}
		}
		return count;
	}
}
