/*	LeetCode 1165 - Single-Row Keyboard
	There is a special keyboard with all keys in a single row.
	Given a string keyboard of length 26 indicating the layout of the keyboard (indexed from 0 to 25), 
	initially your finger is at index 0. 
	To type a character, you have to move your finger to the index of the desired character. 
	The time taken to move your finger from index i to index j is |i – j|.
	You want to type a string word. Write a function to calculate how much time it takes to type it with one finger.
	
	Input: keyboard = "abcdefghijklmnopqrstuvwxyz", word = "cba"
	Output: 4
	Explanation: The index moves from 0 to 2 to write 'c' then to 1 to write 'b' then to 0 again to write 'a'.
	Total time = 2 + 1 + 1 = 4.
	
	Input: keyboard = "pqrstuvwxyzabcdefghijklmno", word = "leetcode"
	Output: 73
*/

import java.util.LinkedHashMap;

class Solution {

	public static int calculateTime(String keyboard, String word) {
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
		int i = 0;
		for (Character ch : keyboard.toCharArray()) {
			map.put(ch, i++);
		}

		int total = 0;
		int currentPosition = 0;

		for (Character ch : word.toCharArray()) {
			total = total + Math.abs(currentPosition - map.get(ch));
			currentPosition = map.get(ch);
		}

		return total;
	}
}
