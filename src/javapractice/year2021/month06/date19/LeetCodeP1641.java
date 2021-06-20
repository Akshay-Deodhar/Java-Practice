package javapractice.year2021.month06.date19;

import java.util.Arrays;

/**
 * 
 */

public class LeetCodeP1641 {
	public int countVowelStrings(int n) {
		int counts[] = new int[5];
		Arrays.fill(counts, 1);
		int step = 1, sum = 0;
		while (step < n) {
			sum = 0;
			for (int i = 0; i < 5; i++) {
				sum += counts[i];
				counts[i] = sum;
			}
			step++;
		}
		sum = 0;
		for (int i = 0; i < 5; i++) {
			sum += counts[i];
		}
		return sum;
	}
}
