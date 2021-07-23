package javapractice.year2021.month07.date23;

//import java.util.*;

/**
 * https://leetcode.com/problems/find-the-smallest-divisor-given-a-threshold/
 */

public class LeetCodeP1283 {
	public int smallestDivisor(int[] nums, int threshold) {
		int len = nums.length;
		int lo = 1, hi = 1_000_000, mid;
		while (lo < hi) {
			mid = lo + (hi - lo) / 2;
			if (calculateQuotientSum(len, nums, mid) <= threshold) {
				hi = mid;
			} else {
				lo = mid + 1;
			}
		}
		return hi;

	}

	private int calculateQuotientSum(int length, int[] nums, int divisor) {
		int sum = 0;
		for (int i = 0; i < length; i++) {
			sum += (nums[i] + divisor - 1) / divisor;
		}
		return sum;
	}
}
