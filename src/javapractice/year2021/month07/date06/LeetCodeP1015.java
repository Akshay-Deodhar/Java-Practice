package javapractice.year2021.month07.date06;

//import java.util.*;

/**
 * https://leetcode.com/problems/smallest-integer-divisible-by-k/
 */

public class LeetCodeP1015 {
	public int smallestRepunitDivByK(int k) {
		if (k % 2 == 0 || k % 5 == 0) {
			return -1;
		}
		int remainder = 1, count = 1;
		remainder %= k;
		while (remainder != 0) {
			remainder = (remainder * 10 + 1) % k;
			count++;
		}
		return count;
	}
}
