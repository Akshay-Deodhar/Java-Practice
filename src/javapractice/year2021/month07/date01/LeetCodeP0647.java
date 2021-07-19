package javapractice.year2021.month07.date01;

import java.util.*;

/**
 * https://leetcode.com/problems/palindromic-substrings/
 */

public class LeetCodeP0647 {
	public int countSubstrings(String s) {
		int len = s.length(), count = 0;
		Set<String> palindromes = new HashSet<>();
		String subStr;
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j <= len; j++) {
				subStr = s.substring(i, j);
				if (i + 1 == j && !palindromes.contains(subStr)) {

				}
				if (palindromes.contains(subStr)) {
					count++;
				} else if (isPalindrome(subStr)) {
					palindromes.add(subStr);
					count++;
				}
			}
		}
		return count;
	}

	private boolean isPalindrome(String s) {
		// buffer.delete(0, buffer.length());
		return new StringBuffer().append(s).reverse().toString().equals(s);
	}
}
