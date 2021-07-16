package javapractice.year2021.month07.date14;

//import java.util.*;

/**
 * https://leetcode.com/problems/single-element-in-a-sorted-array/
 */

public class LeetCodeP0540 {
	public int singleNonDuplicate(int[] nums) {
		int len = nums.length, lo = 0, hi = len - 1, mid;
		while (lo < hi) {
			mid = lo + (hi - lo) / 2;
			if (nums[mid] == nums[mid + 1]) {
				if (mid % 2 == 0) {
					lo = mid + 1;
				} else {
					hi = mid;
				}
			} else {
				if (mid % 2 == 0) {
					hi = mid;
				} else {
					lo = mid + 1;
				}
			}
		}
		return nums[lo];
	}
}
