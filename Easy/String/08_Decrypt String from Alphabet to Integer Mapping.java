/*		LeetCode 1309 - Decrypt String from Alphabet to Integer Mapping
		Given a string s formed by digits ('0' - '9') and '#' . We want to map s to English lowercase characters as follows:

		Characters ('a' to 'i') are represented by ('1' to '9') respectively.
		Characters ('j' to 'z') are represented by ('10#' to '26#') respectively. 
		Return the string formed after mapping.

		It's guaranteed that a unique mapping will always exist.

		Example 1:

		Input: s = "10#11#12"
		Output: "jkab"
		Explanation: "j" -> "10#" , "k" -> "11#" , "a" -> "1" , "b" -> "2".
		Example 2:

		Input: s = "1326#"
		Output: "acz"
		Example 3:

		Input: s = "25#"
		Output: "y"
		Example 4:

		Input: s = "12345678910#11#12#13#14#15#16#17#18#19#20#21#22#23#24#25#26#"
		Output: "abcdefghijklmnopqrstuvwxyz"

*/

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
