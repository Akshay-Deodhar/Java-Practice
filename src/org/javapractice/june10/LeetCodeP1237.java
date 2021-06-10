package org.javapractice.june10;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/find-positive-integer-solution-for-a-given-equation/
 */

public class LeetCodeP1237 {
	public List<List<Integer>> findSolution(CustomFunction customfunction, int z) {
		int x = 1, y = 1000;
		int lo = 1, hi = 1000;
		y = lo + (hi - lo) / 2;
		List<List<Integer>> solutions = new ArrayList<List<Integer>>();
		int value;
		List<Integer> solution;
		while (lo < hi) {
			y = lo + (hi - lo) / 2;
			value = customfunction.f(x, y);
			if (value == z) {
				break;
			} else if (value < z) {
				lo = y + 1;
			} else {
				hi = y;
			}
		}
		while (y > 0) {
			value = customfunction.f(x, y);
			if (value == z) {
				solution = new ArrayList<Integer>();
				solution.add(x);
				solution.add(y);
				solutions.add(solution);
				y--;
			} else if (value > z) {
				y--;
			} else {
				x++;
			}
		}
		return solutions;
	}
}

class CustomFunction {
	// Returns f(x, y) for any given positive integers x and y.
	// Note that f(x, y) is increasing with respect to both x and y.
	// i.e. f(x, y) < f(x + 1, y), f(x, y) < f(x, y + 1)
	public int f(int x, int y) {
		// this is a dummy function, put here so that the compiler wont complain.
		return x + y;
	};
};
