package javapractice.year2021.month07.date16;

//import java.util.*;

/**
 * https://leetcode.com/problems/n-queens-ii/
 */

public class LeetCodeP0052 {
	private int[][] board;
	private int size;
	private int count = 0;

	public int totalNQueens(int n) {
		size = n;
		board = new int[n][n];
		processRow(0);
		return count;
	}

	private void processRow(int idx) {
		boolean isFound;
		if (idx == size) {
			count++;
			return;
		}
		for (int i = 0; i < size; i++) {
			isFound = false;
			// check whether location is ideal for queen
			// if not ideal, continue
			for (int j = idx - 1; j >= 0; j--) {
				if (board[j][i] == 1) {
					isFound = true;
					break;
				}
			}
			if (isFound) {
				continue;
			}
			for (int j = idx - 1, k = i - 1; j >= 0 && k >= 0; j--, k--) {
				if (board[j][k] == 1) {
					isFound = true;
					break;
				}
			}
			if (isFound) {
				continue;
			}
			for (int j = idx - 1, k = i + 1; j >= 0 && k < size; j--, k++) {
				if (board[j][k] == 1) {
					isFound = true;
					break;
				}
			}
			if (isFound) {
				continue;
			}
			// otherwose place queen.
			board[idx][i] = 1;
			// process next row.
			processRow(idx + 1);
			// remove queen
			board[idx][i] = 0;

		}
		return;
	}
}
