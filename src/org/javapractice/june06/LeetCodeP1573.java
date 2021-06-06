package org.javapractice.june06;

/**
 * https://leetcode.com/problems/number-of-ways-to-split-a-string/
 */

public class LeetCodeP1573 {
    private static final int MOD = 1_000_000_007;

    public int numWays(String s) {
	// no-brain solution, maybe this will work.
	int numOnes = 0;
	int len = s.length();
	for (int i = 0; i < len; i++) {
	    if (s.charAt(i) == '1') {
		numOnes++;
	    }
	}
	if (numOnes == 0) {
	    return (int) (((long) (len - 1) * (long) (len - 2) / 2) % MOD);
	}
	if (numOnes % 3 != 0) {
	    return 0;
	}
	int count = 0;
	long start1 = 0L, end1 = 0L, start2 = 0L, end2 = 0L;
	for (int i = 0; i < len; i++) {
	    if (s.charAt(i) == '1') {
		count++;
		if (count == numOnes / 3) {
		    start1 = i;
		}
		if (count == numOnes / 3 + 1) {
		    end1 = i;
		}
		if (count == 2 * numOnes / 3) {
		    start2 = i;
		}
		if (count == 2 * numOnes / 3 + 1) {
		    end2 = i;
		}
	    }
	}
	return (int) (((end2 - start2) * (end1 - start1)) % MOD);

    }

}
