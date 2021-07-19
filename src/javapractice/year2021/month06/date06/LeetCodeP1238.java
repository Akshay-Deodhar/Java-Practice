package javapractice.year2021.month06.date06;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/circular-permutation-in-binary-representation/
 */

public class LeetCodeP1238 {
	public List<Integer> circularPermutation(int n, int start) {
		List<Integer> seed = new ArrayList<Integer>();
		seed.add(0);
		seed.add(1);
		int rep = 1;
		int pow = 2;
		int len;
		while (rep < n) {
			len = seed.size();
			for (int i = len - 1; i >= 0; i--) {
				seed.add(pow + seed.get(i));
			}
			rep++;
			pow *= 2;
		}
		while (seed.get(0) != start) {
			seed.add(seed.get(0));
			seed.remove(0);
		}
		return seed;
	}
}
