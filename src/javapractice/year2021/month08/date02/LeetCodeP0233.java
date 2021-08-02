package javapractice.year2021.month08.date02;

//import java.util.*;

/**
 * https://leetcode.com/problems/number-of-digit-one/
 */

public class LeetCodeP0233 {
	public int countDigitOne(int n) {
		int count = 0, div;
		for (int i = 1; i <= n; i *= 10) {
			div = 10 * i;
			count += (n / div * i + Math.min(Math.max(n % div - i + 1, 0), i));
		}
		return count;
	}
}
