/*	LeetCode 1221 - Split a String in Balanced Strings
	Balanced strings are those who have equal quantity of 'L' and 'R' characters.
	Given a balanced string s split it in the maximum amount of balanced strings.
	Return the maximum amount of splitted balanced strings.
	
	Example 1:
	Input: s = "RLRRLLRLRL"
	Output: 4
	Explanation: s can be split into "RL", "RRLL", "RL", "RL", each substring contains same number of 'L' and 'R'.
	
	Example 2:
	Input: s = "RLLLLRRRLR"
	Output: 3
	Explanation: s can be split into "RL", "LLLRRR", "LR", each substring contains same number of 'L' and 'R'.
	Example 3:

	Input: s = "RLRRRLLRLL"
	Output: 2
	Explanation: s can be split into "RL", "RRRLLRLL", since each substring contains an equal number of 'L' and 'R'
*/

class Solution {
	public int balancedStringSplit(String s) {
		int count = 0;
		int balancedCount = 0;

		for (Character ch : s.toCharArray()) {
			if (ch == 'R')
				count--;
			else if (ch == 'L')
				count++;

			if (count == 0)
				balancedCount++;
		}
		return balancedCount;
	}
}