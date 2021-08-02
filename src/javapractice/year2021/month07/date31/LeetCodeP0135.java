package javapractice.year2021.month07.date31;

import java.util.*;

/**
 * https://leetcode.com/problems/candy/
 */

public class LeetCodeP0135 {
	public int candy(int[] ratings) {
		int len = ratings.length, total = 0;
		int[] l2r = new int[len], r2l = new int[len];
		Arrays.fill(l2r, 1);
		for (int i = 1; i < len; i++) {
			if (ratings[i] > ratings[i - 1]) {
				l2r[i] = l2r[i - 1] + 1;
			}
		}
		Arrays.fill(r2l, 1);
		for (int i = len - 2; i > -1; i--) {
			if (ratings[i] > ratings[i + 1]) {
				r2l[i] = r2l[i + 1] + 1;
			}
		}
		for (int i = 0; i < len; i++) {
			total += Math.max(l2r[i], r2l[i]);
		}
		return total;
	}
}
