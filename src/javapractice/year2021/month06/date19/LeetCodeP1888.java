package javapractice.year2021.month06.date19;

/**
 * https://leetcode.com/problems/minimum-number-of-flips-to-make-the-binary-string-alternating/
 */

public class LeetCodeP1888 {
	public int minFlips(String s) {
		int len = s.length(), evenZeroes = 0, oddZeroes = 0;
		for (int i = 0; i < len; i++) {
			if (s.charAt(i) == '0') {
				if (i % 2 == 0) {
					evenZeroes++;
				} else {
					oddZeroes++;
				}
			}
		}
		if (len % 2 == 0) {
			return getMinFlips(len / 2, len / 2, evenZeroes, oddZeroes);
		} else {
			int min = Integer.MAX_VALUE, temp;
			for (int i = 0; i < len; i++) {
				temp = getMinFlips(len / 2 + 1, len / 2, evenZeroes, oddZeroes);
				min = Math.min(min, temp);
				if (s.charAt(i) == '0') {
					oddZeroes++;
					evenZeroes--;
				}
				temp = oddZeroes;
				oddZeroes = evenZeroes;
				evenZeroes = temp;
			}
			return min;
		}
	}

	private int getMinFlips(int evenLen, int oddLen, int evenZeroes, int oddZeroes) {
		return Math.min(oddLen + evenZeroes - oddZeroes, evenLen + oddZeroes - evenZeroes);
	}
}
