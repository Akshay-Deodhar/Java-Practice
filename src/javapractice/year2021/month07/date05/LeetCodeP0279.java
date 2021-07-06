package javapractice.year2021.month07.date05;

//import java.util.*;

/**
 * https://leetcode.com/problems/perfect-squares/
 */

public class LeetCodeP0279 {
	private int counts[];

	public int numSquares(int n) {
		counts = new int[n + 1];
		counts[0] = 0;
		counts[1] = 1;
		int min;
		for (int i = 2; i <= n; i++) {
			// System.out.println("Computing for " + i);
			min = i;
			for (int j = 1; j * j <= i; j++) {
				// System.out.println("looking at square of side " + j);
				min = Math.min(min, 1 + counts[i - j * j]);
				// System.out.println("min is now " + min);
			}
			counts[i] = min;
			// System.out.println();
		}
		return counts[n];
	}
}
