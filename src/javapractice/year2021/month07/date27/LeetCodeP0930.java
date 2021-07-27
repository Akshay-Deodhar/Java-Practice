package javapractice.year2021.month07.date27;

import java.util.*;

/**
 * https://leetcode.com/problems/binary-subarrays-with-sum/
 */

public class LeetCodeP0930 {
	public int numSubarraysWithSum(int[] arr, int sum) {
		int len = arr.length;
		int[] prefixSums = new int[len + 1];
		for (int i = 0; i < len; ++i)
			prefixSums[i + 1] = prefixSums[i] + arr[i];

		Map<Integer, Integer> count = new HashMap<>();
		int ans = 0;
		for (int x : prefixSums) {
			ans += count.getOrDefault(x, 0);
			count.put(x + sum, count.getOrDefault(x + sum, 0) + 1);
		}

		return ans;
	}
}
