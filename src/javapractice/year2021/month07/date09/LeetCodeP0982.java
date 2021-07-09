package javapractice.year2021.month07.date09;

//import java.util.*;

/**
 * https://leetcode.com/problems/triples-with-bitwise-and-equal-to-zero/
 */

public class LeetCodeP0982 {
	public int countTriplets(int[] nums) {
		int len = nums.length, count = 0;
		for (int i = 0; i < len; i++) {
			for (int j = i; j < len; j++) {
				for (int k = j; k < len; k++) {
					if ((nums[i] & nums[j] & nums[k]) == 0) {
						count += getCounts(i, j, k);
					}
				}
			}
		}
		return count;
	}

	private int getCounts(int i, int j, int k) {
		if (i == j & j == k) {
			return 1;
		}
		if ((i == j) || (k == j) || (i == k)) {
			return 3;
		}
		return 6;
	}
}
