package javapractice.year2021.month06.date21;

/**
 * https://leetcode.com/problems/swap-adjacent-in-lr-string/
 */

public class LeetCodeP0777 {
	public boolean canTransform(String start, String end) {
		int len = start.length();
		if (len != end.length()) {
			return false;
		}
		StringBuffer fStart = new StringBuffer(), fEnd = new StringBuffer();
		int startL = 0, startR = 0, endL = 0, endR = 0;
		for (int i = 0; i < len; i++) {
			if (start.charAt(i) == 'L') {
				fStart.append("L");
				startL++;
			} else if (start.charAt(i) == 'R') {
				fStart.append("R");
				startR++;
			}
			if (end.charAt(i) == 'L') {
				fEnd.append("L");
				endL++;
			} else if (end.charAt(i) == 'R') {
				fEnd.append("R");
				endR++;
			}
			if (startL > endL || startR < endR) {
				return false;
			}
		}
		if (!fStart.toString().equals(fEnd.toString())) {
			return false;
		}
		if (startL != endL || startR != endR) {
			return false;
		} else {
			return true;
		}
	}
}
