package javapractice.year2021.month07.date17;

import javapractice.utils.TreeNode;

//import java.util.*;

/**
 * https://leetcode.com/problems/smallest-string-starting-from-leaf/
 */

public class LeetCodeP0988 {
	private String min = "";

	public String smallestFromLeaf(TreeNode root) {
		processNode(root, "");
		return min;
	}

	private void processNode(TreeNode root, String str) {
		if (root == null) {
			return;
		}
		str = (char) ('a' + root.val) + str;
		if (root.left == null && root.right == null) {
			setMinimumString(str);
			return;
		}
		processNode(root.left, str);
		processNode(root.right, str);
		return;
	}

	private void setMinimumString(String str) {
		if (str.compareTo(min) < 0 || min.isEmpty()) {
			min = str;
			return;
		}
	}
}
