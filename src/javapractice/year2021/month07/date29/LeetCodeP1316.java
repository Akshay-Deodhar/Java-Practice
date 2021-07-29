package javapractice.year2021.month07.date29;

import java.util.*;

/**
 * https://leetcode.com/problems/distinct-echo-substrings/
 */

public class LeetCodeP1316 {
	public int distinctEchoSubstrings(String text) {
		Set<String> strings = new HashSet<>();
		int len = text.length();
		for (int i = 0; i < len; i++) {
			for (int j = 2; i + j <= len; j += 2) {
				if (text.substring(i, i + j / 2).equals(text.substring(i + j / 2, i + j))) {
					strings.add(text.substring(i, i + j));
				}
			}
		}
		return strings.size();
	}
}
