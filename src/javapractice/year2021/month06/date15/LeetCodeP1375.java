package javapractice.year2021.month06.date15;

/**
 * https://leetcode.com/problems/bulb-switcher-iii/
 */

public class LeetCodeP1375 {
	public int numTimesAllBlue(int[] light) {
		int count = 0, len = light.length, sum = 0, bulbSum = 0;
		for (int i = 0; i < len; i++) {
			sum += i;
			bulbSum += (light[i] - 1);
			if (bulbSum == sum) {
				count++;
			}
		}
		return count;
	}
}
