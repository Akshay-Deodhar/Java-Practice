package javapractice.year2021.month07.date27;

//import java.util.*;

/**
 * https://leetcode.com/problems/shifting-letters/
 */

public class LeetCodeP0848 {
	public String shiftingLetters(String s, int[] shifts) {
		char c[] = s.toCharArray();
		int num = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			num = (num + shifts[i]) % 26;
			c[i] += num;
			if (c[i] > 'z')
				c[i] -= 26;
		}
		return new String(c);
	}
}
