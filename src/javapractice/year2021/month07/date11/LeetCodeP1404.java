package javapractice.year2021.month07.date11;

//import java.util.*;

/**
 * https://leetcode.com/problems/number-of-steps-to-reduce-a-number-in-binary-representation-to-one/
 */

public class LeetCodeP1404 {
	public int numSteps(String s) {
		int count = 0, len = s.length(), carry = 0, temp;
		if (len == 1)
			return count;
		for (int i = len - 1; i > -1; i--) {
			if (i == 0 && s.charAt(i) == '1' && carry == 0) {
				break;
			}
			temp = s.charAt(i) - '0' + carry;
			if (temp % 2 == 0) {
				carry = temp / 2;
				count++;
			} else {
				count += 2;
				carry = 1;
			}
		}
		return count;
	}
}
