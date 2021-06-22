package javapractice.year2021.month06.date21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/queens-that-can-attack-the-king/
 */

public class LeetCodeP1222 {
	public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
		List<List<Integer>> result = new ArrayList<>();
		int[][] board = new int[8][8];
		for (int[] queen : queens) {
			board[queen[0]][queen[1]] = 1;
		}
		for (int i = king[0], j = king[1]; i < 8; i++) {
			if (board[i][j] == 1) {
				result.add(Arrays.asList(new Integer[] { i, j }));
				break;
			}
		}
		for (int i = king[0], j = king[1]; i >= 0; i--) {
			if (board[i][j] == 1) {
				result.add(Arrays.asList(new Integer[] { i, j }));
				break;
			}
		}
		for (int i = king[0], j = king[1]; j < 8; j++) {
			if (board[i][j] == 1) {
				result.add(Arrays.asList(new Integer[] { i, j }));
				break;
			}
		}
		for (int i = king[0], j = king[1]; j > -1; j--) {
			if (board[i][j] == 1) {
				result.add(Arrays.asList(new Integer[] { i, j }));
				break;
			}
		}
		for (int i = king[0], j = king[1]; i < 8 & j < 8; i++, j++) {
			if (board[i][j] == 1) {
				result.add(Arrays.asList(new Integer[] { i, j }));
				break;
			}
		}
		for (int i = king[0], j = king[1]; i > -1 & j > -1; i--, j--) {
			if (board[i][j] == 1) {
				result.add(Arrays.asList(new Integer[] { i, j }));
				break;
			}

		}
		for (int i = king[0], j = king[1]; i > -1 && j < 8; i--, j++) {
			if (board[i][j] == 1) {
				result.add(Arrays.asList(new Integer[] { i, j }));
				break;
			}
		}
		for (int i = king[0], j = king[1]; j > -1 & i < 8; j--, i++) {
			if (board[i][j] == 1) {
				result.add(Arrays.asList(new Integer[] { i, j }));
				break;
			}
		}
		return result;
	}

}
