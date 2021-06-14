package javapractice.year2021.month06.date14;

/**
 * https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/
 */

public class LeetCodeP0378 {
	public int kthSmallest(int[][] matrix, int k) {
		if (k == 1) {
			return matrix[0][0];
		}
		int len = matrix.length;
		if (k == len * len) {
			return matrix[len - 1][len - 1];
		}
		int minVal = Integer.MAX_VALUE, minIdx, idxs[] = new int[len], rep = 0;
		while (rep < k) {
			minVal = Integer.MAX_VALUE;
			minIdx = 0;
			for (int i = 0; i < len; i++) {
				if (idxs[i] == len) {
					continue;
				}
				if (matrix[i][idxs[i]] < minVal) {
					minVal = matrix[i][idxs[i]];
					minIdx = i;
				}
			}
			idxs[minIdx]++;
			rep++;
		}
		return minVal;
	}
}
