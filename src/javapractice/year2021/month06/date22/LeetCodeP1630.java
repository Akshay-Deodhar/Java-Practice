package javapractice.year2021.month06.date22;

import java.util.*;

/**
 * https://leetcode.com/problems/arithmetic-subarrays/
 */

public class LeetCodeP1630 {
	private Set<Integer> nbrsSet = new HashSet<>();

	public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
		List<Boolean> results = new ArrayList<>();
		for (int i = 0; i < l.length; i++) {
			results.add(isSubArrayArithmetic(nums, l[i], r[i]));
		}
		return results;
	}

	private boolean isSubArrayArithmetic(int nums[], int start, int end) {
		if (start == end || start == end - 1) {
			return true;
		}
		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, len = end - start + 1;
		for (int i = start; i <= end; i++) {
			nbrsSet.add(nums[i]);
			// System.out.println("Element: " + nums[i]);
			min = Math.min(min, nums[i]);
			max = Math.max(max, nums[i]);
		}
		// System.out.println("max: " + max);
		// System.out.println("min: " + min);
		if ((max - min) % (len - 1) != 0) {
			nbrsSet.clear();
			return false;
		}
		int diff = (max - min) / (len - 1);
		for (int i = 0; i < len; i++) {
			if (!nbrsSet.contains(min + i * diff)) {
				nbrsSet.clear();
				return false;
			}
		}
		nbrsSet.clear();
		return true;
	}
}
