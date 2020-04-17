class Solution {
	public static String freqAlphabets(String s) {
		StringBuffer result = new StringBuffer();
		for (int i = 0; i < s.length(); i++) {
			if (i + 2 < s.length() && s.charAt(i + 2) == '#') {
				String str = Character.toString(s.charAt(i)) + Character.toString(s.charAt(i + 1));
				char ch = (char) (96 + Integer.parseInt(str)); // Assuming 96 as base to calculate ASCII
				result.append(ch);
				i = i + 2;
			} else {
				String str = Character.toString(s.charAt(i));
				result.append((char) (96 + Integer.parseInt(str)));
			}
		}
		return result.toString();
	}
}