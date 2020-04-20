/*	LeetCode 1370 -	 Increasing Decreasing String
	Given a string s. You should re-order the string using the following algorithm:

	Pick the smallest character from s and append it to the result.
	Pick the smallest character from s which is greater than the last appended character to the result and append it.
	Repeat step 2 until you cannot pick more characters.
	Pick the largest character from s and append it to the result.
	Pick the largest character from s which is smaller than the last appended character to the result and append it.
	Repeat step 5 until you cannot pick more characters.
	Repeat the steps from 1 to 6 until you pick all characters from s.
	In each step, If the smallest or the largest character appears more than once you can choose any occurrence and append it to the result.
	
	Return the result string after sorting s with this algorithm.
	
	Example 1:
	
	Input: s = "aaaabbbbcccc"
	Output: "abccbaabccba"
	Explanation: After steps 1, 2 and 3 of the first iteration, result = "abc"
	After steps 4, 5 and 6 of the first iteration, result = "abccba"
	First iteration is done. Now s = "aabbcc" and we go back to step 1
	After steps 1, 2 and 3 of the second iteration, result = "abccbaabc"
	After steps 4, 5 and 6 of the second iteration, result = "abccbaabccba"
	Example 2:
	
	Input: s = "rat"
	Output: "art"
	Explanation: The word "rat" becomes "art" after re-ordering it with the mentioned algorithm.
	Example 3:
	
	Input: s = "leetcode"
	Output: "cdelotee"
	Example 4:
	
	Input: s = "ggggggg"
	Output: "ggggggg"
	Example 5:
	
	Input: s = "spo"
	Output: "ops"
*/

class Solution {
	public static String sortString(String s) {
		int[] count = new int[26];
		StringBuffer sb = new StringBuffer();

		for (char ch : s.toCharArray()) {
			count[ch - 'a']++;
		}

		while (sb.length() < s.length()) {
			addLowerToHigher(sb, count);
			addHigherToLower(sb, count);
		}

		return sb.toString();
	}

	public static void addLowerToHigher(StringBuffer sb, int[] count) {
		for (int i = 0; i < count.length; i++) {
			if (count[i] > 0) {
				sb.append((char) (97 + i));
				count[i]--;
			}
		}
	}

	public static void addHigherToLower(StringBuffer sb, int[] count) {
		for (int i = count.length - 1; i >= 0; i--) {
			if (count[i] > 0) {
				sb.append((char) (97 + i));
				count[i]--;
			}
		}
	}
}