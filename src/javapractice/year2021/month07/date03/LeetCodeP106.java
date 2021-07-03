package javapractice.year2021.month07.date03;

import java.util.*;

import javapractice.utils.TreeNode;

/**
 * https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/
 */

public class LeetCodeP106 {
    private List<Integer> ioTrav;
    int[] poTrav;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        ioTrav = new ArrayList<Integer>();
        poTrav = postorder;
        int len = inorder.length;
        for(int i=0;i<len;i++) {
            ioTrav.add(inorder[i]);
        }
        return getTreeNode(0, len-1, 0, len-1);
    }

    private TreeNode getTreeNode(
        int inStart,
        int inEnd,
        int postStart,
        int postEnd
    ) {
    /*
        The last element of the po traversal is the root element;
        take this element, and find its index in io traversal (let it be i);
        inStart to i-1 is the io traversal of root.left
        i+1 to inEnd is the io traversal of root.right
        postStart to postStart + i - inStart is the po traversal of root.left
        postStart + i-inStart + 1 to postEnd - 1 is the po traversal of root.right
    */
        // System.out.println(inStart + " " + inEnd  + " " + postStart  + " " + postEnd);
        if(inStart > inEnd | postStart > postEnd) {
            return null;
        }
        if(inStart == inEnd & postStart == postEnd) {
            return new TreeNode(ioTrav.get(inStart));
        }
        int rootval = poTrav[postEnd];
        int idx = ioTrav.indexOf(rootval);
        TreeNode root = new TreeNode(rootval);
        root.left = getTreeNode(
            inStart,
            idx-1,
            postStart,
            postStart + idx - inStart-1
        );
        root.right = getTreeNode(
            idx + 1,
            inEnd,
            postStart + idx - inStart,
            postEnd-1
        );
        return root;
    }
}
