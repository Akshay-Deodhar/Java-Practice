package javapractice.year2021.month07.date19;

//import java.util.*;

/**
 * https://leetcode.com/problems/minimum-operations-to-make-array-equal/
 */

public class LeetCodeP1551 {
	public int minOperations(int n) {
		if (n % 2 == 0) {
			return n * n / 4;
		} else {
			int x = n / 2;
			return x * (x + 1);
		}
	}
}
