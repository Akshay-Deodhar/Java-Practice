package javapractice.year2021.month07.date16;

import java.util.*;

/**
 * https://leetcode.com/problems/n-queens/
 */

public class LeetCodeP0051 {
	private List<List<String>> solutions = new ArrayList<List<String>>();
	private int size;
	private int[][] board;
	private StringBuffer buffer = new StringBuffer();

	public List<List<String>> solveNQueens(int n) {

		size = n;
		board = new int[size][size];
		processRow(0);
		return solutions;
	}

	private void processRow(int rowIdx) {
		// for(int i=0;i<rowIdx;i++) {
		// System.out.print("\t");
		// }
		// System.out.println("Processing row " + rowIdx);
		if (rowIdx == size) {
			processBoard();
			return;
		}
		for (int i = 0; i < size; i++) {
			if (isValidMove(rowIdx, i)) {
				board[rowIdx][i] = 1;
				processRow(rowIdx + 1);
				board[rowIdx][i] = 0;
			}
		}
		return;
	}

	private boolean isValidMove(int row, int col) {
		// for(int i=0;i<row;i++) {
		// System.out.print("\t");
		// }
		// System.out.println("Checking for " + row + " & " + col);
		for (int i = row - 1; i >= 0; i--) {
			if (board[i][col] == 1) {
				return false;
			}
		}
		for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
			if (board[i][j] == 1) {
				return false;
			}
		}
		for (int i = row - 1, j = col + 1; i >= 0 && j < size; i--, j++) {
			if (board[i][j] == 1) {
				return false;
			}
		}
		return true;
	}

	private void processBoard() {
		List<String> solution = new ArrayList<String>();
		for (int[] row : board) {
			for (int i : row) {
				buffer.append(i == 1 ? "Q" : ".");
			}
			solution.add(buffer.toString());
			buffer.delete(0, size);
		}
		solutions.add(solution);
		return;
	}
}
