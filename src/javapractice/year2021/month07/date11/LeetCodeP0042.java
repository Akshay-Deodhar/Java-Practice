package javapractice.year2021.month07.date11;

//import java.util.*;

/**
 * https://leetcode.com/problems/trapping-rain-water/
 */

public class LeetCodeP0042 {
	public int trap(int[] height) {
		if (height.length < 3)
			return 0;
		int len = height.length, result = 0;
		int[] left = new int[len], right = new int[len];
		left[0] = height[0];
		right[len - 1] = height[len - 1];
		for (int i = 1; i < len; i++) {
			left[i] = Math.max(left[i - 1], height[i]);
			right[len - 1 - i] = Math.max(right[len - i], height[len - 1 - i]);
		}
		for (int i = 1; i < len - 1; i++) {
			result += (Math.min(left[i], right[i]) - height[i]);
		}
		return result;
	}
}
