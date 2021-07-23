package javapractice.year2021.month07.date23;

//import java.util.*;

/**
 * https://leetcode.com/problems/check-if-array-pairs-are-divisible-by-k/
 */

public class LeetCodeP1497 {
	public boolean canArrange(int[] nums, int k) {
		int[] counts = new int[k];
		for (int i : nums) {
			counts[getRemainder(i, k)]++;
		}
		if (counts[0] % 2 == 1) {
			return false;
		}
		int l = 1, r = k - 1;
		while (l < r) {
			if (counts[l] != counts[r]) {
				return false;
			}
			l++;
			r--;
		}
		if (l == r && counts[l] % 2 == 1) {
			return false;
		}
		return true;
	}

	private int getRemainder(int a, int b) {
		int rem = a % b;
		while (rem < 0) {
			rem += b;
		}
		return rem;
	}
}
