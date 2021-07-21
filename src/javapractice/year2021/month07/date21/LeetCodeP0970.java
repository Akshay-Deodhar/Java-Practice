package javapractice.year2021.month07.date21;

import java.util.*;

/**
 * https://leetcode.com/problems/powerful-integers/
 */

public class LeetCodeP0970 {
	public List<Integer> powerfulIntegers(int x, int y, int bound) {
		Set<Integer> result = new HashSet<>();
		int iMax, jMax, val;
		if (x == 1 && y == 1) {
			if (bound >= 2)
				result.add(2);
			return new ArrayList<>(result);
		}
		if (x == 1) {
			iMax = 1;
		} else {
			iMax = (int) (Math.log(bound) / Math.log(x));
		}
		if (y == 1) {
			jMax = 1;
		} else {
			jMax = (int) (Math.log(bound) / Math.log(y));
		}
		for (int i = 0; i <= iMax; i++) {
			for (int j = 0; j <= jMax; j++) {
				val = (int) Math.pow(x, i) + (int) Math.pow(y, j);
				if (val <= bound) {
					result.add(val);
				}
			}
		}
		return new ArrayList<Integer>(result);
	}
}
