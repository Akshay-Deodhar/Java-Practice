package javapractice.year2021.month07.date06;

//import java.util.*;

/**
 * https://leetcode.com/problems/valid-palindrome-ii/
 */

public class LeetCodeP0680 {
	public boolean validPalindrome(String s) {
		return isValidPalindrome(s, 0, s.length() - 1, false);
	}

	private boolean isValidPalindrome(String s, int l, int r, boolean isDeleted) {
		if (l >= r) {
			return true;
		}
		if (s.charAt(l) == s.charAt(r)) {
			return isValidPalindrome(s, l + 1, r - 1, isDeleted);
		} else if (isDeleted) {
			return false;
		} else {
			return isValidPalindrome(s, l, r - 1, true) || isValidPalindrome(s, l + 1, r, true);
		}
	}
}
