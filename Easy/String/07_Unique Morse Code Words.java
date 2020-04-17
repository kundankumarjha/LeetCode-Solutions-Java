import java.util.HashSet;
import java.util.Set;

class Solution {
	public static int uniqueMorseRepresentations(String[] words) {
		String[] MORSE = new String[] { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-",
				".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--",
				"--.." };

		Set<String> result = new HashSet<>();

		for (String word : words) {
			StringBuffer code = new StringBuffer();
			for (char ch : word.toCharArray()) {
				code.append(MORSE[ch - 'a']);
			}
			result.add(code.toString());
		}

		return result.size();
	}
}