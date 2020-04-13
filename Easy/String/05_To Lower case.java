/*	LeetCode 709 - To Lower Case
	Implement function ToLowerCase() that has a string parameter str, and returns the same string in lowercase.
*/

class Solution {
	public String toLowerCase(String str) {
		StringBuffer sb = new StringBuffer();
		for (Character ch : str.toCharArray()) {
			int ascii = ch;
			if ((ascii >= 65) && (ascii <= 90)) {
				ascii = ascii + 32;
				sb.append((char) ascii);
			} else
				sb.append(ch);
		}
		return sb.toString();
	}
}