package javapractice.year2021.month07.date18;

import java.util.*;

/**
 * https://leetcode.com/problems/reduction-operations-to-make-the-array-elements-equal/
 */

public class LeetCodeP1887 {
	public int reductionOperations(int[] nums) {
		int len = nums.length, count = 0;
		Arrays.sort(nums);
		for (int i = 0; i < len - 1; i++) {
			if (nums[i] < nums[i + 1]) {
				count += (len - i - 1);
			}
		}
		return count;
	}
}
