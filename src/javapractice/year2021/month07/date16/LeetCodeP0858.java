package javapractice.year2021.month07.date16;

//import java.util.*;

/**
 * https://leetcode.com/problems/mirror-reflection/
 */

public class LeetCodeP0858 {
	public int mirrorReflection(int p, int q) {
		if (q == 0) {
			return 0;
		}
		if (q == p) {
			return 1;
		}
		int lcm = findLCM(p, q), pRem = lcm % (2 * p), qRem = lcm % (2 * q);
		if (pRem == 0 && qRem == q) {
			return 0;
		}
		if (pRem == p && qRem == q) {
			return 1;
		}
		if (pRem == p && qRem == 0) {
			return 2;
		}
		return 2;
	}

	private int findLCM(int a, int b) {
		int max = Math.max(a, b), min = a + b - max, temp;
		while (max % min != 0) {
			temp = max % min;
			max = min;
			min = temp;
		}
		return a * b / min;
	}
}
