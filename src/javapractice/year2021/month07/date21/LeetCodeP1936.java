package javapractice.year2021.month07.date21;

//import java.util.*;

/**
 * https://leetcode.com/problems/add-minimum-number-of-rungs/
 */

public class LeetCodeP1936 {
	public int addRungs(int[] rungs, int dist) {
		int len = rungs.length, count, val;
		count = rungs[0] > dist ? (rungs[0] % dist != 0 ? rungs[0] / dist : (rungs[0] / dist - 1)) : 0;
		for (int i = 0; i < len - 1; i++) {
			val = rungs[i + 1] - rungs[i];
			count += (val > dist ? (val % dist != 0 ? val / dist : val / dist - 1) : 0);
		}
		return count;
	}
}
