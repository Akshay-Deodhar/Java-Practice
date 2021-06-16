package javapractice.year2021.month06.date16;

/**
 * https://leetcode.com/problems/count-numbers-with-unique-digits/
 */

public class LeetCodeP0357 {
	private static int counts[] = new int[10];

	{
		counts[0] = 1;
		int digits = 0;
		int subtotal = 1;
		int mult = 9;
		while (digits < 9) {
			subtotal *= mult;
			if (digits != 0) {
				mult--;
			}
			digits++;
			// System.out.println(subtotal);
			counts[digits] = subtotal;
		}
	}

	public int countNumbersWithUniqueDigits(int n) {
		int sum = 0;
		for (int i = 0; i <= n; i++) {
			sum += counts[i];
		}
		return sum;
	}
}
