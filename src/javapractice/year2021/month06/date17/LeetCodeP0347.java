package javapractice.year2021.month06.date17;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/top-k-frequent-elements/
 */

public class LeetCodeP0347 {
	public int[] topKFrequent(int[] nums, int k) {
		Map<Integer, Integer> counts = new HashMap<Integer, Integer>();
		for (int num : nums) {
			counts.put(num, counts.getOrDefault(num, 0) + 1);
		}
		int len = counts.keySet().size();
		int[][] sortedCounts = new int[len][2];
		int i = 0;
		for (int key : counts.keySet()) {
			int[] arr = new int[] { key, counts.get(key) };
			sortedCounts[i] = arr;
			i++;
		}
		Arrays.sort(sortedCounts, new Comparator<int[]>() {
			public int compare(int[] x, int[] y) {
				return -x[1] + y[1];
			}
		});
		int[] result = new int[k];
		for (i = 0; i < k; i++) {
			result[i] = sortedCounts[i][0];
		}
		return result;
	}
}
