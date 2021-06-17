package javapractice.year2021.month06.date17;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/subarray-sum-equals-k/
 */

public class LeetCodeP0560 {
	private Map<Integer, Integer> sumCounts = new HashMap<Integer, Integer>();

	public int subarraySum(int[] nums, int k) {
		try {
			int sum = 0, count = 0;
			sumCounts.put(0, 1);
			for (int nbr : nums) {
				sum += nbr;
				if (sumCounts.containsKey(sum - k)) {
					count += sumCounts.get(sum - k);
				}
				if (sumCounts.containsKey(sum)) {
					sumCounts.put(sum, sumCounts.get(sum) + 1);
				} else {
					sumCounts.put(sum, 1);
				}
			}
			return count;
		} finally {
			sumCounts.clear();
		}
	}
}
