package javapractice.year2021.month07.date05;

import java.util.*;

/**
 * https://leetcode.com/problems/largest-number/
 */

public class LeetCodeP0179 {
	public String largestNumber(int[] nums) {
		if (nums.length == 1) {
			return Integer.toString(nums[0]);
		}
		String result = "";
		String[] x = new String[nums.length];
		for (int i = 0; i < nums.length; i++) {
			x[i] = Integer.toString(nums[i]);
		}
		Arrays.sort(x, new Comparator<String>() {
			public int compare(String first, String second) {
				return (second + first).compareTo(first + second);
			}
		});
		for (int i = 0; i < x.length; i++) {
			// System.out.println(x[i]);
			result += x[i];
		}
		while (result.length() > 1 && result.charAt(0) == '0') {
			result = result.substring(1);
		}
		return result;
	}
}
