/* 	Leetcode 1180 - Count Substrings with Only One Distinct Letter
	Given a string S, return the number of substrings that have only one distinct letter.

	Example 1:
	Input: S = “aaaba”
	Output: 8
	Explanation: The substrings with one distinct letter are “aaa”, “aa”, “a”, “b”.
	“aaa” occurs 1 time.
	“aa” occurs 2 times.
	“a” occurs 4 times.
	“b” occurs 1 time.
	So the answer is 1 + 2 + 4 + 1 = 8.

	Example 2:

	Input: S = “aaaaaaaaaa”
	Output: 55

*/

class Solution {
	public static int countLetters(String str) {
		int result = 0;

		for (int i = 0; i < str.length(); i++) {
			for (int j = i; j < str.length() && (str.charAt(j) == str.charAt(i)); j++) {
				result = result + 1;
			}
		}
		return result;
	}
}