package javapractice.year2021.month06.date25;

import java.util.*;

/**
 * https://leetcode.com/problems/combinations/
 */

public class LeetCodeP0077 {
	private List<List<Integer>> result;
	private int max;

	public List<List<Integer>> combine(int n, int k) {
		result = new ArrayList<>();
		max = n;
		List<Integer> current = new ArrayList<>();
		for (int i = 1; i <= n - k + 1; i++) {
			populateList(current, i, k);
		}
		return result;
	}

	private void populateList(List<Integer> current, int nbr, int k) {
		if (current.size() >= k || nbr > max) {
			return;
		}
		if (max - nbr + 1 < k - current.size()) {
			return;
		}
		current.add(nbr);
		if (current.size() == k) {
			result.add(new ArrayList<>(current));
			current.remove(current.size() - 1);
			return;
		}
		for (int i = nbr + 1; i <= max; i++) {
			populateList(current, i, k);
		}
		current.remove(current.size() - 1);
		return;
	}
}
