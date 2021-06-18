package javapractice.year2021.month06.date18;

/**
 * https://leetcode.com/problems/construct-binary-search-tree-from-preorder-traversal/
 */

public class LeetCodeP1008 {
	int len;

	public TreeNode bstFromPreorder(int[] preorder) {
		len = preorder.length;
		return getTreeNode(preorder, 0, len - 1);
	}

	private TreeNode getTreeNode(int[] preOrder, int start, int end) {
		if (start > len - 1 || end < 0 || end < start) {
			return null;
		}
		TreeNode root = new TreeNode(preOrder[start]);
		if (start == end) {
			return root;
		}
		if (preOrder[start + 1] > preOrder[start]) {
			root.right = getTreeNode(preOrder, start + 1, end);
			return root;
		}
		if (preOrder[end] < preOrder[start]) {
			root.left = getTreeNode(preOrder, start + 1, end);
			return root;
		}
		int i = start + 1;
		while (i < len && i <= end && preOrder[i] < preOrder[start]) {
			i++;
		}
		root.left = getTreeNode(preOrder, start + 1, i - 1);
		root.right = getTreeNode(preOrder, i, end);
		return root;
	}
}

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