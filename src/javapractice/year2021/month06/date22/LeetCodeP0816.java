package javapractice.year2021.month06.date22;

import javapractice.utils.TreeNode;

/**
 * https://leetcode.com/problems/binary-tree-pruning/
 */

public class LeetCodeP0816 {
	public TreeNode pruneTree(TreeNode root) {
		if (root == null) {
			return root;
		}
		if (root.left != null) {
			root.left = pruneTree(root.left);
		}
		if (root.right != null) {
			root.right = pruneTree(root.right);
		}
		if (root.left == null && root.right == null) {
			if (root.val == 0) {
				return null;
			} else {
				return root;
			}
		} else {
			return root;
		}
	}
}
