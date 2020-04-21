/*	LeetCode 557 - Reverse Words in a String III
	Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
	
	Example 1:
	Input: "Let's take LeetCode contest"
	Output: "s'teL ekat edoCteeL tsetnoc"
*/

class Solution {
	public static String reverseWords(String s) {
		int i = 0;
		int n = s.length();
		StringBuilder sb = new StringBuilder();
		int start = 0;
		
		while (i < n) {
			while (i < n && s.charAt(i) != ' ') {
				i++;
			}
			int curr = i - 1;
			while (curr >= start) {
				sb.append(s.charAt(curr--));
			}
			if (i != n) {
				sb.append(" ");
			}
			i++;
			start = i;
		}
		return sb.toString();
	}
}