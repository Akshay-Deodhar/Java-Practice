package javapractice.year2021.month07.date09;

import javapractice.utils.TreeNode;

//import java.util.*;

/**
 * https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/
 */

public class LeetCodeP0236 {
    private TreeNode answer = null;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        processNode(root, p, q);
        return this.answer;
    }
    private boolean processNode(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) {
            return false;
        }
        int left, right, curr;
        left = processNode(root.left, p, q) ? 1:0;
        right = processNode(root.right, p, q) ? 1:0;
        curr = (root.val == p.val) || (root.val == q.val) ? 1:0;
        if(left+right+curr>=2) {
            this.answer = root;
            return true;
        }
        return left + right + curr > 0;
    }
}
