package javapractice.year2021.month07.date29;

import java.util.*;

/**
 * https://leetcode.com/problems/beautiful-array/
 */

public class LeetCodeP0932 {

	Map<Integer, int[]> memo;

	public int[] beautifulArray(int N) {
		memo = new HashMap<Integer, int[]>();
		return f(N);
	}

	public int[] f(int N) {
		if (memo.containsKey(N))
			return memo.get(N);

		int[] ans = new int[N];
		if (N == 1) {
			ans[0] = 1;
		} else {
			int t = 0;
			for (int x : f((N + 1) / 2)) // odds
				ans[t++] = 2 * x - 1;
			for (int x : f(N / 2)) // evens
				ans[t++] = 2 * x;
		}
		memo.put(N, ans);
		return ans;
	}
}
