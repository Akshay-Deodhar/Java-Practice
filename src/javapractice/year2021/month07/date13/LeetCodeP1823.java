package javapractice.year2021.month07.date13;

import java.util.*;

/**
 * https://leetcode.com/problems/find-the-winner-of-the-circular-game/
 */

public class LeetCodeP1823 {
	public int findTheWinner(int n, int k) {
		if (n == 1 || k == 1) {
			return n;
		}
		int roundsLeft = n - 1, i = 0, size = n;
		List<Integer> people = new ArrayList<Integer>();
		for (i = 1; i <= n; i++) {
			people.add(i);
		}
		i = 0;
		while (roundsLeft > 0) {
			roundsLeft--;
			for (int j = 0; j < k - 1; j++) {
				i = (i + 1) % size;
			}
			// System.out.println(people.get(i));
			people.remove(i);
			if (i == size - 1) {
				i = 0;
			}
			size--;
		}
		return people.get(0);
	}
}
