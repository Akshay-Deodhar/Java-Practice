package javapractice.year2021.month07.date13;

import java.util.*;

/**
 * https://leetcode.com/problems/can-make-palindrome-from-substring/
 */

public class LeetCodeP1177 {
	public List<Boolean> canMakePaliQueries(String s, int[][] queries) {

		List<Boolean> ans = new ArrayList<>();
		int len = s.length();
		int[] prefixSum = new int[len];

		int mask = 1 << (s.charAt(0) - 'a');
		prefixSum[0] = mask;
		for (int i = 1; i < len; i++)
			prefixSum[i] = prefixSum[i - 1] ^ (1 << (s.charAt(i) - 'a'));

		for (int[] query : queries) {

			int start = query[0], end = query[1], k = query[2], count = 0;
			if (start == 0)
				count = Integer.bitCount(prefixSum[end]);
			else
				count = Integer.bitCount(prefixSum[end] ^ prefixSum[start - 1]);
			ans.add((count / 2 <= k) ? true : false);
		}

		return ans;
	}
}
