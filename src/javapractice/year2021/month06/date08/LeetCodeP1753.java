package javapractice.year2021.month06.date08;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/maximum-score-from-removing-stones/
 */

public class LeetCodeP1753 {
	public int maximumScore(int a, int b, int c) {
		int[] stones = new int[] { a, b, c };
		return nbrSteps(stones);
	}

	private int nbrSteps(int[] arr) {
		if (arr.length < 3)
			return 0;
		int a = arr[0], b = arr[1], c = arr[2];
		if (a < 0 | b < 0 | c < 0) {
			return 0;
		}
		if (a == 0 && b == 0 && c >= 0) {
			return 0;
		}
		if (b == 0 && c == 0 && a > 0) {
			return 0;
		}
		if (c == 0 && a == 0 && b > 0) {
			return 0;
		}
		Arrays.sort(arr);
		arr[arr.length - 1]--;
		arr[arr.length - 2]--;
		return 1 + nbrSteps(arr);
	}
}
