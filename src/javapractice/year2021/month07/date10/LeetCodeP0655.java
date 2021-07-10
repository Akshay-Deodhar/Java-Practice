package javapractice.year2021.month07.date10;

import javapractice.utils.TreeNode;

import java.util.*;

/**
 * https://leetcode.com/problems/print-binary-tree/
 */

public class LeetCodeP0655 {
	private String[][] matrix;
	private int width, height;

	public List<List<String>> printTree(TreeNode root) {
		height = getTreeHeight(root);
		width = (int) Math.pow(2, height) - 1;
		// System.out.println(height + " " + width);
		matrix = new String[height][width];
		for (int i = 0; i < height; i++) {
			Arrays.fill(matrix[i], "");
		}
		populateMatrix(root, 0, 0, width - 1);
		List<List<String>> result = new ArrayList<>();
		for (String[] row : matrix) {
			result.add(Arrays.asList(row));
		}
		return result;
	}

	private void populateMatrix(TreeNode root, int depth, int leftBound, int rightBound) {
		if (root == null) {
			return;
		}
		int mid = leftBound + (-leftBound + rightBound) / 2;
		matrix[depth][mid] = Integer.toString(root.val);
		populateMatrix(root.left, depth + 1, leftBound, mid - 1);
		populateMatrix(root.right, depth + 1, mid + 1, rightBound);
		return;
	}

	private int getTreeHeight(TreeNode root) {
		if (root == null) {
			return 0;
		}
		return 1 + Math.max(getTreeHeight(root.left), getTreeHeight(root.right));
	}
}
