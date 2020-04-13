/* 	LeetCode 1108
	Given a valid (IPv4) IP address, return a defanged version of that IP address.
	A defanged IP address replaces every period "." with "[.]".
	Input: address = "1.1.1.1"
	Output: "1[.]1[.]1[.]1"
*/

class Solution {
	public String defangIPaddr(String address) {
		StringBuffer sb = new StringBuffer();

		for (Character ch : address.toCharArray()) {
			if (ch == '.')
				sb.append("[.]");
			else
				sb.append(ch);
		}
		return sb.toString();
	}
}

