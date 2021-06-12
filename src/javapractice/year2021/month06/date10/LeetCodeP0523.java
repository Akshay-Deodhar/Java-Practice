package javapractice.year2021.month06.date10;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/continuous-subarray-sum/
 */

public class LeetCodeP0523 {
	public boolean checkSubarraySum(int[] nums, int k) {
		int len = nums.length;
		if (len == 1)
			return false;
		if (k == 1)
			return true;
		Map<Integer, Integer> indexes = new HashMap<Integer, Integer>();
		int sum = 0;
		indexes.put(0, -1);
		for (int i = 0; i < len; i++) {
			sum = (sum + nums[i]) % k;
			if (!indexes.containsKey(sum)) {
				indexes.put(sum, i);
			} else {
				if (i - indexes.get(sum) > 1) {
					return true;
				}
			}
		}
		return false;
	}
}
