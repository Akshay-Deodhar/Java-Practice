package javapractice.year2021.month07.date26;

import javapractice.utils.TreeNode;

//import java.util.*;

/**
 * https://leetcode.com/problems/pseudo-palindromic-paths-in-a-binary-tree/
 */

public class LeetCodeP1457 {
	private int count = 0;
	private int[] nbrCounts = new int[10];

	public int pseudoPalindromicPaths(TreeNode root) {
		processNode(root);
		return count;
	}

	private void processNode(TreeNode root) {
		if (root == null) {
			return;
		}
		nbrCounts[root.val]++;
		if (root.left == null && root.right == null) {
			processMap();
		} else {
			processNode(root.left);
			processNode(root.right);
		}
		nbrCounts[root.val]++;
		return;
	}

	private void processMap() {
		boolean isOddNumberFound = false;
		for (int i : nbrCounts) {
			if (i % 2 == 1) {
				if (isOddNumberFound) {
					return;
				} else {
					isOddNumberFound = true;
				}
			}
		}
		count++;
		return;
	}
}
