package javapractice.year2021.month07.date21;

//import java.util.*;

/**
 * https://leetcode.com/problems/sum-of-absolute-differences-in-a-sorted-array/
 */

public class LeetCodeP1685 {
	public int[] getSumAbsoluteDifferences(int[] nums) {
		int len = nums.length, diff[] = new int[len];
		long lSum = 0, rSum = 0, mult = -(len - 1);
		for (int i = 0; i < len; i++) {
			rSum += nums[i];
		}
		for (int i = 0; i < len; i++) {
			rSum -= nums[i];
			if (i > 0) {
				lSum += nums[i - 1];
			}
			diff[i] = (int) (rSum - lSum + mult * nums[i]);
			mult += 2;
		}
		return diff;
	}
}
