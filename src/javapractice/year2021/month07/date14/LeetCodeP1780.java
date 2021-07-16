package javapractice.year2021.month07.date14;

//import java.util.*;

/**
 * https://leetcode.com/problems/check-if-number-is-a-sum-of-powers-of-three/
 */

public class LeetCodeP1780 {
	public boolean checkPowersOfThree(int n) {
		int rem = 0;
		while (n > 0) {
			rem = n % 3;
			if (rem == 2) {
				return false;
			}
			n /= 3;
		}
		return true;
	}
}
