package javapractice.year2021.month08.date04;

//import java.util.*;

/**
 * https://leetcode.com/problems/check-if-it-is-a-good-array/
 */

public class LeetCodeP1250 {
	public boolean isGoodArray(int[] nums) {
		int gcd = nums[0];
		for (int i = 1; i < nums.length; i++) {
			gcd = findGCD(gcd, nums[i]);
			if (gcd == 1) {
				return true;
			}
		}
		return gcd == 1;
	}

	private int findGCD(int a, int b) {
		int min = Math.min(a, b), max = a + b - min, temp = max % min;
		while (temp != 0) {
			max = min;
			min = temp;
			temp = max % min;
		}
		return min;
	}
}
