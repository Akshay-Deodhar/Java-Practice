package javapractice.year2021.month06.date14;

/**
 * https://leetcode.com/problems/subarray-sums-divisible-by-k/
 */

public class LeetCodeP0974 {
	public int subarraysDivByK(int[] nums, int k) {
		int len = nums.length;
		int remCounts[] = new int[k];
		int sum = 0;
		for (int i = 0; i < len; i++) {
			sum = sum + nums[i];
			remCounts[((sum % k) + k) % k]++;
		}
		sum = remCounts[0] * (remCounts[0] + 1) / 2;
		for (int i = 1; i < k; i++) {
			sum += remCounts[i] * (remCounts[i] - 1) / 2;
		}
		return sum;
	}
}
