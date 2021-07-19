package javapractice.year2021.month07.date10;

import javapractice.utils.TreeNode;

//import java.util.*;

/**
 * https://leetcode.com/problems/diameter-of-binary-tree/
 */

public class LeetCodeP0543 {
	public int diameterOfBinaryTree(TreeNode root) {
		if (root == null) {
			return 0;
		}
		return Math.max(getTreeHeight(root.left) + getTreeHeight(root.right),
				Math.max(diameterOfBinaryTree(root.left), diameterOfBinaryTree(root.right)));
	}

	private int getTreeHeight(TreeNode root) {
		if (root == null) {
			return 0;
		}
		return 1 + Math.max(getTreeHeight(root.left), getTreeHeight(root.right));
	}
}
