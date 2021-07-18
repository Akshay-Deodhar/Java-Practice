package javapractice.year2021.month07.date18;

import java.util.*;

/**
 * https://leetcode.com/problems/4sum-ii/
 */

public class LeetCodeP0454 {
	private Map<Integer, Integer> counts12;

	public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
		int total = 0, len = nums1.length, sum;
		counts12 = new HashMap<>();
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				sum = nums1[i] + nums2[j];
				counts12.put(sum, 1 + counts12.getOrDefault(sum, 0));
			}
		}
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				sum = -(nums3[i] + nums4[j]);
				total += counts12.getOrDefault(sum, 0);
			}
		}
		return total;
	}
}
