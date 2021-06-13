package javapractice.year2021.month06.date13;

/**
 * https://leetcode.com/problems/can-convert-string-in-k-moves/
 */

public class LeetCodeP1540 {
	private final int SIZE = 26;

	public boolean canConvertString(String s, String t, int k) {
		// trivial cases
		if (s.equals(t)) {
			return true;
		}
		if (s.length() != t.length()) {
			return false;
		}

		int len = s.length(), increment;
		int incrCounts[] = new int[SIZE];
		for (int i = 0; i < len; i++) {
			// calculate increment for i'th character.
			increment = (t.charAt(i) - s.charAt(i) + SIZE) % SIZE;
			// if chars are the same, then continue
			if (increment != 0) {
				incrCounts[increment]++;
			}
		}
		// reusing increment as count
		for (int i = 1; i < SIZE; i++) {
			if (incrCounts[i] == 0) {
				continue;
			}
			if (k < (incrCounts[i] - 1) * SIZE + i) {
				return false;
			}
		}
		return true;
	}
}
