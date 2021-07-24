package javapractice.year2021.month07.date24;

import java.util.*;

import javapractice.utils.TreeNode;

/**
 * https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/
 */

public class LeetCodeP0103 {
	private List<List<Integer>> result = new ArrayList<>();

	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		processNode(root, 0);
		return result;
	}

	private void processNode(TreeNode root, int idx) {
		if (root == null) {
			return;
		}
		while (idx >= result.size()) {
			result.add(new ArrayList<Integer>());
		}
		if (idx % 2 == 0) {
			result.get(idx).add(root.val);
		} else {
			result.get(idx).add(0, root.val);
		}
		processNode(root.left, idx + 1);
		processNode(root.right, idx + 1);
		return;
	}
}
