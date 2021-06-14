package javapractice.year2021.month06.date14;

/**
 * https://leetcode.com/problems/integer-break/
 */

public class LeetCodeP0343 {
	public int integerBreak(int n) {
		if (n == 2)
			return 1;
		if (n == 3)
			return 2;
		int result = 4;
		int step = 4;
		while (step < n) {
			if (result % 2 == 0) {
				result = result * 3 / 2;
			} else {
				result = result * 4 / 3;
			}
			step++;
		}
		return result;
	}

}
