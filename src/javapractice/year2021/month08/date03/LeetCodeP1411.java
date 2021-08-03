package javapractice.year2021.month08.date03;

//import java.util.*;

/**
 * https://leetcode.com/problems/number-of-ways-to-paint-n-3-grid/
 */

public class LeetCodeP1411 {
	private int MOD = 1_000_000_007;

	public int numOfWays(int n) {
		int step = 1;
		long count2 = 6, count3 = 6, prev2, prev3;
		while (step < n) {
			prev2 = count2;
			prev3 = count3;
			count2 = (prev2 * 3 + prev3 * 2) % MOD;
			count3 = (prev2 * 2 + prev3 * 2) % MOD;
			step++;
		}
		return (int) ((count2 + count3) % MOD);
	}
}
