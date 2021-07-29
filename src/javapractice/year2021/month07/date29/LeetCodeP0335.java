package javapractice.year2021.month07.date29;

//import java.util.*;

/**
 * https://leetcode.com/problems/self-crossing/
 */

public class LeetCodeP0335 {
	public boolean isSelfCrossing(int[] distance) {
		for (int i = 3; i < distance.length; i++) {
			if (distance[i] >= distance[i - 2] && distance[i - 1] <= distance[i - 3]) {
				return true;
			}
			if (i >= 4 && distance[i] + distance[i - 4] >= distance[i - 2] && distance[i - 1] == distance[i - 3]) {
				return true;
			}
			if (i >= 5 && distance[i - 2] >= distance[i - 4] && distance[i] + distance[i - 4] >= distance[i - 2]
					&& distance[i - 1] <= distance[i - 3] && distance[i - 1] + distance[i - 5] >= distance[i - 3]) {
				return true;
			}
		}
		return false;
	}
}
