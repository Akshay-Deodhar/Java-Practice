package javapractice.year2021.month08.date01;

import java.util.*;

/**
 * https://leetcode.com/problems/reducing-dishes/
 */

public class LeetCodeP1402 {
	public int maxSatisfaction(int[] satisfaction) {
		Arrays.sort(satisfaction);
		int len = satisfaction.length, sum = 0, total = 0;
		for (int i = len - 1; i >= 0; i--) {
			if (total < total + sum + satisfaction[i]) {
				sum += satisfaction[i];
				total += sum;
			}
		}
		return total;
	}
}
