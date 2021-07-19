package javapractice.year2021.month06.date07;

/**
 * https://leetcode.com/problems/find-peak-element/submissions/
 */

public class LeetCodeP0162 {
	public int findPeakElement(int[] nums) {
		return findPeakIdx(nums, 0, nums.length - 1);
	}

	private int findPeakIdx(int[] nums, int start, int end) {
		if (start >= end)
			return start;
		int mid = start + (end - start) / 2;
		if (nums[mid] > nums[mid + 1]) {
			return findPeakIdx(nums, start, mid);
		} else {
			return findPeakIdx(nums, mid + 1, end);
		}
	}
}
