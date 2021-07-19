package javapractice.year2021.month07.date19;

import java.util.*;

/**
 * https://leetcode.com/problems/random-pick-with-weight/
 */

public class LeetCodeP0528 {
}

class Solution {
	private final int[] values;
	private final int len;
	private final int max;
	private final Random rand;

	public Solution(int[] w) {
		rand = new Random();
		values = w;
		len = w.length;
		for (int i = 1; i < len; i++) {
			values[i] += values[i - 1];
		}
		max = values[len - 1];
	}

	public int pickIndex() {
		int value = rand.nextInt(max);
		int lo = 0, hi = len - 1, mid;
		while (lo < hi) {
			mid = lo + (hi - lo) / 2;
			if (values[mid] <= value) {
				lo = mid + 1;
			} else {
				hi = mid;
			}
		}
		return lo;
	}
}