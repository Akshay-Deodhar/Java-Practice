package javapractice.year2021.month07.date10;

//import java.util.*;

/**
 * https://leetcode.com/problems/last-moment-before-all-ants-fall-out-of-a-plank/
 */

public class LeetCodeP1503 {
	public int getLastMoment(int n, int[] left, int[] right) {
		int last = -1;
		for (int i : right) {
			// System.out.println("Right: " + i + " " + (n-i+1));
			last = Math.max(last, n - i);
		}
		for (int i : left) {
			// System.out.println("Left: " + i + " " + (i+1));
			last = Math.max(last, i);
		}
		return last;
	}
}
