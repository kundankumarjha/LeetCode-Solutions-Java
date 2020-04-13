/* 	LeetCode 1119
	Given a string S, remove the vowels 'a', 'e', 'i', 'o', and 'u' from it, and return the new string. */
package easy.string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {

	public static String removeVowels(String s) {
		StringBuilder sb = new StringBuilder();
		Set<Character> set = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

		for (Character ch : s.toCharArray()) {
			if (!(set.contains(ch)))
				sb.append(ch);
		}
		return sb.toString();
	}
}
