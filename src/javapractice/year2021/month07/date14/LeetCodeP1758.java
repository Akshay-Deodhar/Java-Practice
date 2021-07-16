package javapractice.year2021.month07.date14;

//import java.util.*;

/**
 * https://leetcode.com/problems/minimum-changes-to-make-alternating-binary-string/
 */

public class LeetCodeP1758 {
	public int minOperations(String s) {
		char[] chArr = s.toCharArray();
		int alt1 = 0, alt2 = 1, len = s.length(), count1 = 0, count2 = 0;
		for (int i = 0; i < len; i++) {
			count1 += ((chArr[i] - '0') ^ alt1);
			count2 += ((chArr[i] - '0') ^ alt2);
			alt1 = 1 - alt1;
			alt2 = 1 - alt2;
		}
		return Math.min(count1, count2);
	}
}
