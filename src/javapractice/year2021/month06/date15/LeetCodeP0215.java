package javapractice.year2021.month06.date15;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/kth-largest-element-in-an-array/
 */

public class LeetCodeP0215 {
	public int findKthLargest(int[] nums, int k) {
		Arrays.sort(nums);
		return nums[nums.length - k];
	}
}
