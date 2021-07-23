package javapractice.year2021.month07.date23;

//import java.util.*;

/**
 * https://leetcode.com/problems/partition-array-into-disjoint-intervals/
 */

public class LeetCodeP0915 {
	public int partitionDisjoint(int[] nums) {
		int len = nums.length, max = -1;
		int[] right = new int[len];
		right[len - 1] = nums[len - 1];
		for (int i = len - 2; i >= 0; i--) {
			right[i] = Math.min(nums[i], right[i + 1]);
		}

		for (int i = 0; i < len - 1; i++) {
			max = Math.max(max, nums[i]);
			if (max <= right[i + 1]) {
				return i + 1;
			}
		}
		return len;
	}
}
