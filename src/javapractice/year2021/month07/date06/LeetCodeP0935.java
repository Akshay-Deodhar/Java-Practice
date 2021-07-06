package javapractice.year2021.month07.date06;

import java.util.*;

/**
 * https://leetcode.com/problems/knight-dialer/
 */

public class LeetCodeP0935 {
	private int MOD = 1_000_000_007;

	public int knightDialer(int n) {
		int[] prev = new int[10], curr = new int[10];
		Arrays.fill(prev, 1);
		int step = 1, sum = 0;
		while (step < n) {
			step++;
			curr[0] = (prev[4] + prev[6]) % MOD;
			curr[1] = (prev[6] + prev[8]) % MOD;
			curr[2] = (prev[7] + prev[9]) % MOD;
			curr[3] = (prev[4] + prev[8]) % MOD;
			curr[4] = ((prev[3] + prev[9]) % MOD + prev[0]) % MOD;
			curr[6] = ((prev[1] + prev[7]) % MOD + prev[0]) % MOD;
			curr[7] = (prev[2] + prev[6]) % MOD;
			curr[8] = (prev[1] + prev[3]) % MOD;
			curr[9] = (prev[2] + prev[4]) % MOD;
			for (int i = 0; i < 10; i++) {
				prev[i] = curr[i];
			}
		}
		for (int i : prev) {
			sum += i;
			sum %= MOD;
		}
		return sum < 0 ? sum + MOD : sum;
	}
}
