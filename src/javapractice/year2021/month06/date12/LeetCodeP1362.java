package javapractice.year2021.month06.date12;

/**
 * https://leetcode.com/problems/closest-divisors/
 */

public class LeetCodeP1362 {
	public int[] closestDivisors(int num) {
		int num1 = num + 1, num2 = num + 2;
		// int sqrt1 = (int)Math.sqrt(num+1) + 1;
		int sqrt = (int) (Math.sqrt(num2) + 1);
		int div1 = 1, div2 = num2;
		for (int i = 1; i <= sqrt; i++) {
			// System.out.println(i);
			if (num1 % i == 0 & i <= num1 / i) {
				if (num1 / i - i < div2 - div1) {
					div1 = i;
					div2 = num1 / i;
				}
			}
			if (num2 % i == 0 & i <= num2 / i) {
				if (num2 / i - i < div2 - div1) {
					div1 = i;
					div2 = num2 / i;
				}
			}
		}
		return new int[] { div1, div2 };
	}
}
