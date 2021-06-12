package javapractice.year2021.month06.date10;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/making-file-names-unique/
 */

public class LeetCode1487 {
	public String[] getFolderNames(String[] names) {
		Map<String, Integer> counts = new HashMap<String, Integer>();
		int len = names.length;
		int index;
		for (int i = 0; i < len; i++) {
			if (counts.containsKey(names[i])) {
				index = counts.get(names[i]);
				while (counts.containsKey(names[i] + "(" + index + ")")) {
					index++;
				}
				counts.put(names[i], index + 1);
				names[i] = names[i] + "(" + index + ")";
				counts.put(names[i], 1);
			} else {
				counts.put(names[i], 1);
			}
		}
		return names;
	}
}
