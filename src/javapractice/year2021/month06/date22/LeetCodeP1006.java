package javapractice.year2021.month06.date22;

/**
 * https://leetcode.com/problems/clumsy-factorial/
 */

public class LeetCodeP1006 {
	public int clumsy(int n) {
		if (n == 1)
			return 1;
		if (n == 2)
			return 2;
		if (n == 3)
			return 6;
		int total = n * (n - 1) / (n - 2);
		for (int i = n - 3; i > 0; i -= 4) {
			total += numberOps(i);
		}
		return total;
	}

	private int numberOps(int n) {
		if (n < 4)
			return 1;
		return n - (n - 1) * (n - 2) / (n - 3);
	}
}
