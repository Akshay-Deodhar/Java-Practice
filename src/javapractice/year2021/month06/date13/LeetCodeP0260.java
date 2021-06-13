package javapractice.year2021.month06.date13;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/single-number-iii/
 */

public class LeetCodeP0260 {
	public int[] singleNumber(int[] nums) {
		if (nums.length == 2) {
			return nums;
		}
		Arrays.sort(nums);
		int len = nums.length, i = 0, j = len - 1;
		;
		while (i < len & nums[i] == nums[i + 1]) {
			i += 2;
		}
		while (j > -1 & nums[j] == nums[j - 1]) {
			j -= 2;
		}
		return new int[] { nums[i], nums[j] };
	}
}
