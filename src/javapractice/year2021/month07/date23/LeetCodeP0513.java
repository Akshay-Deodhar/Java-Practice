package javapractice.year2021.month07.date23;

import javapractice.utils.TreeNode;

//import java.util.*;

/**
 * https://leetcode.com/problems/find-bottom-left-tree-value/
 */

public class LeetCodeP0513 {
	public int findBottomLeftValue(TreeNode root) {
		return getValue(root, 0)[1];
	}

	private int[] getValue(TreeNode root, int height) {
		if (root == null) {
			return new int[] { -1, 0 };
		}
		int[] rArr = getValue(root.right, height + 1), lArr = getValue(root.left, height + 1);
		if (lArr[0] == -1 && rArr[0] == -1) {
			return new int[] { height, root.val };
		}
		if (lArr[0] == -1) {
			return rArr;
		}
		if (rArr[0] == -1) {
			return lArr;
		}
		if (lArr[0] >= rArr[0]) {
			return lArr;
		} else {
			return rArr;
		}
	}
}
