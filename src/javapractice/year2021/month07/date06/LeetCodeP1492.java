package javapractice.year2021.month07.date06;

import java.util.*;

/**
 * https://leetcode.com/problems/the-kth-factor-of-n/
 */

public class LeetCodeP1492 {
	public int kthFactor(int n, int k) {
		List<Integer> factors = new ArrayList<Integer>();
		for (int i = 1; i <= n; i++) {
			if (n % i != 0) {
				continue;
			}
			factors.add(i);
			if (factors.size() == k) {
				return factors.get(k - 1);
			}
		}
		return -1;
	}
}
