package javapractice.year2021.month07.date27;

import javapractice.utils.TreeNode;

//import java.util.*;

/**
 * https://leetcode.com/problems/subtree-of-another-tree/
 */

public class LeetCodeP0572 {
	public boolean isSubtree(TreeNode root, TreeNode subRoot) {
		if (subRoot == null) {
			return true;
		}
		if (root == null) {
			return false;
		}
		if (areTreesEqual(root, subRoot)) {
			return true;
		}
		return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
	}

	public boolean areTreesEqual(TreeNode root1, TreeNode root2) {
		if (root1 == null && root2 == null) {
			return true;
		}
		if (root1 == null || root2 == null) {
			return false;
		}
		if (root1.val != root2.val) {
			return false;
		}
		return areTreesEqual(root1.left, root2.left) && areTreesEqual(root1.right, root2.right);
	}
}
