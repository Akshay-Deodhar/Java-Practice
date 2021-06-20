package javapractice.year2021.month06.date19;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/rabbits-in-forest/
 */

public class LeetCodeP0781 {
	public int numRabbits(int[] answers) {
		if (answers.length == 1) {
			return answers[0] + 1;
		}
		Map<Integer, Integer> counts = new HashMap<Integer, Integer>();
		for (int i : answers) {
			counts.put(i, 1 + counts.getOrDefault(i, 0));
		}
		int val, sum = 0;
		for (int i : counts.keySet()) {
			val = counts.get(i);
			sum += (i + 1) * ((val / (i + 1)) + (val % (i + 1) == 0 ? 0 : 1));
		}
		return sum;
	}
}
