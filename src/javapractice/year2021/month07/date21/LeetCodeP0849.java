package javapractice.year2021.month07.date21;

//import java.util.*;

/**
 * https://leetcode.com/problems/maximize-distance-to-closest-person/
 */

public class LeetCodeP0849 {
	public int maxDistToClosest(int[] seats) {
		int len = seats.length, prev = -1, max = 0;
		for (int i = 0; i < len; i++) {
			if (seats[i] == 0) {
				continue;
			}
			if (prev == -1) {
				max = Math.max(max, i);
				prev = i;
			} else {
				max = Math.max(max, (i - prev) / 2);
				prev = i;
			}
		}
		max = Math.max(max, len - 1 - prev);
		return max;
	}
}
