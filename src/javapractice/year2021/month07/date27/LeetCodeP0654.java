package javapractice.year2021.month07.date27;

import javapractice.utils.TreeNode;

//import java.util.*;

/**
 * https://leetcode.com/problems/maximum-binary-tree/
 */

public class LeetCodeP0654 {
	public TreeNode constructMaximumBinaryTree(int[] nums) {
		return makeTree(nums, 0, nums.length - 1);
	}

	private TreeNode makeTree(int[] nums, int start, int end) {
		if (start > end) {
			return null;
		}
		if (start == end) {
			return new TreeNode(nums[start]);
		}
		int max = nums[start], maxIdx = start;
		for (int i = start + 1; i <= end; i++) {
			if (nums[i] > max) {
				max = nums[i];
				maxIdx = i;
			}
		}
		TreeNode result = new TreeNode(max, makeTree(nums, start, maxIdx - 1), makeTree(nums, maxIdx + 1, end));
		return result;
	}
}
