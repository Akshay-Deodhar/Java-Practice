package javapractice.year2021.month08.date03;

//import java.util.*;

/**
 * https://leetcode.com/problems/minimum-falling-path-sum-ii/
 */

public class LeetCodeP1289 {
	public int minFallingPathSum(int[][] arr) {
		int len = arr.length, br = arr[0].length;
		int firstIdx = -1, secondIdx = -1, prevFirst, prevSecond;
		for (int i = 0; i < br; i++) {
			if (firstIdx == -1 || arr[len - 1][i] <= arr[len - 1][firstIdx]) {
				secondIdx = firstIdx;
				firstIdx = i;
			} else if (secondIdx == -1 || arr[len - 1][i] <= arr[len - 1][secondIdx]) {
				secondIdx = i;
			}
		}

		for (int i = len - 2; i >= 0; i--) {
			prevFirst = firstIdx;
			prevSecond = secondIdx;
			firstIdx = -1;
			secondIdx = -1;
			for (int j = 0; j < br; j++) {
				if (j == prevFirst) {
					arr[i][j] += arr[i + 1][prevSecond];
				} else {
					arr[i][j] += arr[i + 1][prevFirst];
				}
				if (firstIdx == -1 || arr[i][j] <= arr[i][firstIdx]) {
					secondIdx = firstIdx;
					firstIdx = j;
				} else if (secondIdx == -1 || arr[i][j] <= arr[i][secondIdx]) {
					secondIdx = j;
				}
			}
		}
		return arr[0][firstIdx];
	}
}
