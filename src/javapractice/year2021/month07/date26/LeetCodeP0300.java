package javapractice.year2021.month07.date26;

//import java.util.*;

/**
 * https://leetcode.com/problems/longest-increasing-subsequence/
 */

public class LeetCodeP0300 {
	public int lengthOfLIS(int[] nums) {
		int len = nums.length, lengths[] = new int[len], temp;
		for (int i = 0; i < len; i++) {
			temp = 1;
			for (int j = 0; j < i; j++) {
				if (nums[j] < nums[i]) {
					temp = Math.max(temp, 1 + lengths[j]);
				}
			}
			lengths[i] = temp;
		}
		temp = 0;
		for (int i = 0; i < len; i++) {
			temp = Math.max(temp, lengths[i]);
		}
		return temp;
	}
}
