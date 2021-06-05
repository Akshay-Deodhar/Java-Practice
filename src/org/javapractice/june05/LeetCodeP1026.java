package org.javapractice.june05;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/maximum-difference-between-node-and-ancestor/
 */

public class LeetCodeP1026 {
    private List<TreeNode> ancestors = new ArrayList<TreeNode>();
    int maxVal;
    public int maxAncestorDiff(TreeNode root) {
        maxVal = Integer.MIN_VALUE;
        processNode(root);
        return maxVal;
    }

    private void processNode(TreeNode node) {
        if(node == null) return;
        for(TreeNode i : ancestors) {
            maxVal = Math.max(maxVal, Math.abs(i.val - node.val));
        }
        ancestors.add(0,node);
        processNode(node.left);
        processNode(node.right);
        ancestors.remove(0);
        return;
    }

}

final class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }