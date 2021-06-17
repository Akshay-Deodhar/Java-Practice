package javapractice.year2021.month06.date17;

/**
 * https://leetcode.com/problems/koko-eating-bananas/
 */

public class LeetCodeP0875 {
	public int minEatingSpeed(int[] piles, int h) {
		int max = Integer.MIN_VALUE;
		for (int nbr : piles) {
			max = Math.max(max, nbr);
		}
		int lo = 1, hi = max, mid = lo, count;
		while (lo < hi) {
			mid = lo + (hi - lo) / 2;
			count = getHours(piles, mid);
			if (count > h) {
				lo = mid + 1;
			} else {
				hi = mid;
			}
		}
		return lo;
	}

	private int getHours(int[] arr, int div) {
		int count = 0;
		for (int nbr : arr) {

			count += ((nbr % div == 0 ? 0 : 1) + nbr / div);
		}
		return count;
	}
}
