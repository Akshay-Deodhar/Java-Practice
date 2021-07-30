package javapractice.year2021.month07.date30;

//import java.util.*;

/**
 * https://leetcode.com/problems/01-matrix/
 */

public class LeetCodeP0542 {
	public int[][] updateMatrix(int[][] mat) {
		int len = mat.length, br = mat[0].length;
		int[][] result = new int[len][br];
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < br; j++) {
				if (mat[i][j] == 0) {
					result[i][j] = 0;
				} else {
					if (i == 0 && j == 0) {
						result[i][j] = 1_000_000;
					} else if (i == 0) {
						result[i][j] = 1 + result[i][j - 1];
					} else if (j == 0) {
						result[i][j] = 1 + result[i - 1][j];
					} else {
						result[i][j] = 1 + Math.min(result[i - 1][j], result[i][j - 1]);
					}
				}
			}
		}
		for (int i = len - 1; i >= 0; i--) {
			for (int j = br - 1; j >= 0; j--) {
				if (mat[i][j] == 1) {
					if (i == len - 1 && j == br - 1) {
						continue;
					} else if (i == len - 1) {
						result[i][j] = Math.min(result[i][j], 1 + result[i][j + 1]);
					} else if (j == br - 1) {
						result[i][j] = Math.min(result[i][j], 1 + result[i + 1][j]);
					} else {
						result[i][j] = Math.min(result[i][j], 1 + Math.min(result[i][j + 1], result[i + 1][j]));
					}
				}
			}
		}
		return result;
	}
}
