package javapractice.year2021.month06.date29;

//import java.util.*;

/**
 * https://leetcode.com/problems/beautiful-arrangement/
 */

public class LeetCodeP0526 {
	boolean[] visited;
	int count = 0;

	public int countArrangement(int n) {
		visited = new boolean[n + 1];
		for (int i = 1; i <= n; i++) {
			putNbrInPosition(n, i, 1);
		}
		return count;
	}

	private void putNbrInPosition(int length, int nbr, int position) {
		if (nbr % position != 0 & position % nbr != 0) {
			return;
		}
		if (position == length) {
			count++;
			return;
		}
		visited[nbr] = true;
		for (int i = 1; i <= length; i++) {
			if (visited[i]) {
				continue;
			}
			putNbrInPosition(length, i, position + 1);
		}
		visited[nbr] = false;
		return;
	}
}
