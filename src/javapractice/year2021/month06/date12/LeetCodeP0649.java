package javapractice.year2021.month06.date12;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/dota2-senate/
 */

public class LeetCodeP0649 {
	private final String R = "R";
	private final String D = "D";

	public String predictPartyVictory(String senate) {
		if (!senate.contains(R))
			return "Dire";
		if (!senate.contains(D))
			return "Radiant";
		HashMap<String, String> roundMap = new HashMap<String, String>();
		roundMap.put("senate", senate);
		while (senate.length() > 1) {
			processVotingRound(roundMap);
			senate = roundMap.get("senate");
			if (!senate.contains(R))
				return "Dire";
			if (!senate.contains(D))
				return "Radiant";
		}
		if (!senate.contains(R))
			return "Dire";
		else
			return "Radiant";

	}

	private void processVotingRound(Map<String, String> map) {
		String s = map.get("senate");
		int len = s.length();
		int index;
		for (int i = 0; i < len; i++) {
			if (s.charAt(i) == R.charAt(0)) {
				if (s.substring(i).contains(D)) {
					index = s.indexOf(D, i);
					len--;
					s = s.substring(0, index) + s.substring(index + 1);
				} else if (s.contains(D)) {
					index = s.indexOf(D);
					len--;
					i--;
					s = s.substring(0, index) + s.substring(index + 1);
				}
			} else {
				if (s.substring(i).contains(R)) {
					index = s.indexOf(R, i);
					len--;
					s = s.substring(0, index) + s.substring(index + 1);
				} else if (s.contains(R)) {
					index = s.indexOf(R);
					len--;
					i--;
					s = s.substring(0, index) + s.substring(index + 1);
				}
			}
		}
		map.put("senate", s);
	}
}
