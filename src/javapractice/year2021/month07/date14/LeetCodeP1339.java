package javapractice.year2021.month07.date14;

import javapractice.utils.TreeNode;

//import java.util.*;

/**
 * https://leetcode.com/problems/maximum-product-of-splitted-binary-tree/
 */

public class LeetCodeP1339 {
    long sumAll=0;
    long maxProduct;
    
    public int maxProduct(TreeNode root) {
        sumAll=modify(root);
        maxProduct=1;
        findMaxP(root);
        return (int)(maxProduct % (int)(Math.pow(10, 9) + 7));
    }
    
    public void findMaxP(TreeNode root){
        if(root==null) return;
        
        if(root.left!=null){
            long ans=(root.left.val*(sumAll-root.left.val));
            maxProduct=Math.max(maxProduct,ans);
            findMaxP(root.left);
        }
        
        if(root.right!=null){
            long ans=(root.right.val*(sumAll-root.right.val));
            maxProduct=Math.max(maxProduct,ans);
            findMaxP(root.right);
        }
    }
    
    public int modify(TreeNode root){
        if(root==null) return 0;
        
        int left=modify(root.left);
        int right=modify(root.right);
        return root.val=root.val+left+right;
        
    }
}
