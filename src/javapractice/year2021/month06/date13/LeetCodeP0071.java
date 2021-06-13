package javapractice.year2021.month06.date13;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/simplify-path/
 */

public class LeetCodeP0071 {
	public String simplifyPath(String path) {
		String[] dirs = path.split("/");
		List<String> newDirs = new ArrayList<String>();
		String newPath = "";
		for (String dir : dirs) {
			// System.out.println(dir);
			if (dir.isEmpty() | dir.equals("."))
				continue;
			else if (dir.equals("..")) {
				if (newDirs.size() > 0) {
					newDirs.remove(newDirs.size() - 1);
				}
				continue;
			} else {
				newDirs.add(dir);
			}
		}
		for (String newDir : newDirs) {
			newPath += ("/" + newDir);
		}
		return newPath.isEmpty() ? "/" : newPath;
	}
}
