package javapractice.year2021.month06.date07;

/**
 * https://leetcode.com/problems/delete-leaves-with-a-given-value/submissions/
 */

public class LeetCodeP1325 {
	public TreeNode removeLeafNodes(TreeNode root, int target) {
		if (root == null) {
			return null;
		}
		if (root.val == target && root.left == null && root.right == null) {
			return null;
		}
		if (root.left != null)
			root.left = removeLeafNodes(root.left, target);
		if (root.right != null)
			root.right = removeLeafNodes(root.right, target);
		if (root.val == target && root.left == null && root.right == null) {
			return null;
		}
		return root;
	}
}

// Definition for a binary tree node.
class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode() {
	}

	TreeNode(int val) {
		this.val = val;
	}

	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}
