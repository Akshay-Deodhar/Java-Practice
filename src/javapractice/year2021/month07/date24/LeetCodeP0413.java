package javapractice.year2021.month07.date24;

//import java.util.*;

/**
 * https://leetcode.com/problems/arithmetic-slices/
 */

public class LeetCodeP0413 {
	public int numberOfArithmeticSlices(int[] nums) {
		int count = 0, tempCount = 0, prev;
		if (nums.length < 3) {
			return count;
		}
		prev = nums[1] - nums[0];
		for (int i = 2; i < nums.length; i++) {
			if (nums[i] - nums[i - 1] == prev) {
				tempCount++;
				count += tempCount;
			} else {
				tempCount = 0;
				prev = nums[i] - nums[i - 1];
			}
		}
		return count;
	}
}
