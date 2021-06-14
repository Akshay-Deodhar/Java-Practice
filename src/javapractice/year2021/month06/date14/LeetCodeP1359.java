package javapractice.year2021.month06.date14;

/**
 * https://leetcode.com/problems/count-all-valid-pickup-and-delivery-options/
 */

public class LeetCodeP1359 {
	private long MOD = (int) Math.pow(10, 9) + 7;

	public int countOrders(int n) {
		long count = 1;
		for (int i = n; i > 0; i -= 1) {
			count *= (i * (2 * i - 1));
			count %= MOD;
		}
		return (int) count;
	}
}
