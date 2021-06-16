package javapractice.year2021.month06.date16;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/smallest-string-with-a-given-numeric-value/
 */

public class LeetCodeP1663 {
	public String getSmallestString(int n, int k) {
		char[] chArray = new char[n];
		Arrays.fill(chArray, 'a');
		// this generates a string of length k
		k = k - n;
		int pointer = n - 1;
		while (k > 0) {
			if (k > 25) {
				chArray[pointer] += 25;
				pointer--;
				k -= 25;
			} else {
				chArray[pointer] += k;
				pointer--;
				k -= k;
			}
		}
		return new String(chArray);
	}
}
