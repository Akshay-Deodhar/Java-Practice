package javapractice.year2021.month07.date18;

import java.util.*;

/**
 * https://leetcode.com/problems/finding-pairs-with-a-certain-sum/
 */

public class LeetCodeP1865 {
}

class FindSumPairs {
	private final Map<Integer, Integer> counts2;
	private final int[] nums1, nums2;

	public FindSumPairs(int[] p_nums1, int[] p_nums2) {
		counts2 = new TreeMap<>();
		nums1 = p_nums1;
		nums2 = p_nums2;
		for (int i : nums2) {
			counts2.put(i, 1 + counts2.getOrDefault(i, 0));
		}
	}

	public void add(int index, int val) {
		if (val == 0) {
			return;
		}
		counts2.put(nums2[index], -1 + counts2.get(nums2[index]));
		nums2[index] += val;
		counts2.put(nums2[index], 1 + counts2.getOrDefault(nums2[index], 0));
	}

	public int count(int tot) {
		int count = 0;
		for (int i : nums1) {
			count += counts2.getOrDefault(tot - i, 0);
		}
		return count;
	}
}
