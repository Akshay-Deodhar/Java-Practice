package javapractice.year2021.month06.date04;

/**
 * https://leetcode.com/problems/pairs-of-songs-with-total-durations-divisible-by-60/
 */

public class LeetCodeP1010 {
	public int numPairsDivisibleBy60(int[] time) {
		int[] rems = new int[60];
		int count = 0;
		for (int i = 0; i < time.length; i++) {
			rems[time[i] % 60]++;
		}
		for (int i = 1; i < 30; i++) {
			count += (rems[i] * rems[60 - i]);
		}
		if (rems[30] >= 2) {
			count += (rems[30] * (rems[30] - 1) / 2);
		}
		if (rems[00] >= 2) {
			count += (rems[0] * (rems[0] - 1) / 2);
		}
		return count;
	}
}
