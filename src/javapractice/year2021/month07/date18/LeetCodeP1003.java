package javapractice.year2021.month07.date18;

//import java.util.*;

/**
 * https://leetcode.com/problems/check-if-word-is-valid-after-substitutions/
 */

public class LeetCodeP1003 {
	public boolean isValid(String s) {
		// System.out.println("-------");
		String block = "abc";
		int pos;
		while (s.length() > 0) {
			// System.out.println(s);
			pos = s.indexOf(block);
			if (pos == -1) {
				return false;
			}
			s = s.replaceAll("abc", "");
		}
		return true;
	}
}
