package org.javapractice.problems;

/**
 * https://leetcode.com/problems/can-you-eat-your-favorite-candy-on-your-favorite-day/
 * 
 * @author JJPL242-PC
 *
 */

public class LeetCodeP1744 {
    public boolean[] canEat(int[] candiesCount, int[][] queries) {
	long[] pSumArray = new long[candiesCount.length];
	pSumArray[0] = candiesCount[0];

	for (int i = 1; i < candiesCount.length; i++) {
	    pSumArray[i] = (long) pSumArray[i - 1] + (long) candiesCount[i];
	}
	boolean[] ans = new boolean[queries.length];
	int i = 0;

	for (int[] query : queries) {
	    long value = 0;
	    if (query[0] > 0) {
		value = pSumArray[query[0] - 1];
	    }
	    long cap = (long) ((long) (query[1] + 1) * (long) query[2]);

	    if (value < cap && pSumArray[query[0]] >= (query[1] + 1)) {
		ans[i] = true;
	    }
	    i++;
	}

	return ans;
    }
}
