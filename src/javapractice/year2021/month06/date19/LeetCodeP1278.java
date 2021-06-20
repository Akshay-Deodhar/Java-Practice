package javapractice.year2021.month06.date19;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/number-of-burgers-with-no-waste-of-ingredients/
 */

public class LeetCodeP1278 {
	private List<Integer> solution = new ArrayList<>();

	public List<Integer> numOfBurgers(int tomatoSlices, int cheeseSlices) {
		try {
			if (tomatoSlices % 2 == 1 || tomatoSlices / 2 < cheeseSlices || 2 * cheeseSlices < tomatoSlices / 2) {
				return solution;
			}
			solution.add(tomatoSlices / 2 - cheeseSlices);
			solution.add(2 * cheeseSlices - tomatoSlices / 2);
			return new ArrayList<Integer>(solution);
		} finally {
			solution.clear();
		}
	}
}
