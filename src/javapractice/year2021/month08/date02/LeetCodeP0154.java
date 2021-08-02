package javapractice.year2021.month08.date02;

//import java.util.*;

/**
 * https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/
 */

public class LeetCodeP0154 {
	public int findMin(int[] nums) {
		int len = nums.length, min = nums[0];
		for (int i = 1; i < len; i++) {
			min = Math.min(min, nums[i]);
		}
		return min;
	}
}
