package javapractice.year2021.month06.date07;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/minimum-increment-to-make-array-unique/submissions/
 */

public class LeetCodeP0945 {
    int[] count = new int[50000];

    public int minIncrementForUnique(int[] nums) {
	try {
	    for (int i : nums) {
		count[i]++;
	    }
	    int extras = 0, increment = 0;
	    for (int i = 0; i < 50000; i++) {
		if (count[i] >= 2) {
		    extras += (count[i] - 1);
		    increment = increment - (count[i] - 1) * i;
		} else if (count[i] == 0 && extras > 0) {
		    extras--;
		    increment = increment + i;
		}
	    }
	    return increment;
	} finally {
	    Arrays.fill(count, 0);
	}
    }
}
