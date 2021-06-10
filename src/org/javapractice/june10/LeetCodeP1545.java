package org.javapractice.june10;

/**
 * https://leetcode.com/problems/find-kth-bit-in-nth-binary-string/
 */

public class LeetCodeP1545 {
	public char findKthBit(int n, int k) {
		if (n == 1)
			return '0';
		int midPoint = 1;
		for (int i = 1; i < n; i++) {
			midPoint *= 2;
		}
		return findKthBit(n, k, midPoint);
	}

	public char findKthBit(int n, int k, int midPt) {
		if (n == 1) {
			return '0';
		}
		if (k == midPt) {
			return '1';
		}
		if (k < midPt) {
			return findKthBit(n - 1, k, midPt / 2);
		} else {
			return reversebit(findKthBit(n - 1, 2 * midPt - k, midPt / 2));
		}
	}

	private char reversebit(char ch) {
		return (char) ('1' + '0' - ch);
	}

}
