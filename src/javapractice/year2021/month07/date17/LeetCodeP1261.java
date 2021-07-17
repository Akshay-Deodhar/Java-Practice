package javapractice.year2021.month07.date17;

import java.util.*;

import javapractice.utils.TreeNode;

/**
 * https://leetcode.com/problems/find-elements-in-a-contaminated-binary-tree/
 */

public class LeetCodeP1261 {
}

class FindElements {
	private final Set<Integer> nbrs;

	public FindElements(TreeNode root) {
		this.nbrs = new HashSet<Integer>();
		processNode(root, 0);
	}

	public boolean find(int target) {
		return nbrs.contains(target);
	}

	private void processNode(TreeNode root, int value) {
		if (root == null) {
			return;
		}
		nbrs.add(value);
		processNode(root.left, 2 * value + 1);
		processNode(root.right, 2 * value + 2);
	}
}
