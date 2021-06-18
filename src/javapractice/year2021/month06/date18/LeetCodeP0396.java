package javapractice.year2021.month06.date18;

/**
 * https://leetcode.com/problems/rotate-function/
 */

public class LeetCodeP0396 {
	public int maxRotateFunction(int[] nums) {
		long sum = 0, fn = 0, count = 0, len = nums.length;
		long max = Long.MIN_VALUE;
		for (int i = 0; i < len; i++) {
			sum += nums[i];
			fn += (i * nums[i]);
		}
		max = Math.max(max, fn);
		while (count != len - 1) {
			fn += sum;
			fn -= (len * nums[(int) (len - 1 - count)]);
			max = Math.max(max, fn);
			count++;
		}
		return (int) max;
	}
}
