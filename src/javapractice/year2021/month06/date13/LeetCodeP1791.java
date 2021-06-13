package javapractice.year2021.month06.date13;

/**
 * https://leetcode.com/problems/find-center-of-star-graph/
 */

public class LeetCodeP1791 {
	public int findCenter(int[][] edges) {
		int[] first = edges[0], second = edges[1];
		if (first[0] == second[0]) {
			return first[0];
		} else if (first[0] == second[1]) {
			return first[0];
		} else {
			return first[1];
		}
	}
}
