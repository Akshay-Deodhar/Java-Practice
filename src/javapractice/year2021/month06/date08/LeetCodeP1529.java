package javapractice.year2021.month06.date08;

/**
 * https://leetcode.com/problems/bulb-switcher-iv/
 */

public class LeetCodeP1529 {
	public int minFlips(String target) {
		if (!(target.contains("0"))) {
			return 1;
		}
		if (!(target.contains("1"))) {
			return 0;
		}
		int len = target.length();
		int count = 1;
		int idx = target.indexOf("1");
		for (int i = idx; i < len - 1; i++) {
			if (target.charAt(i) != target.charAt(i + 1)) {
				count++;
			}
		}
		return count;
	}
}
