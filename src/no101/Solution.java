package no101;

import node.TreeNode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isSymmetric(TreeNode root) {
    	if(null == root)
    		return true;
        return isSameTree(root.left, root.right);
    }
    
    private boolean isSameTree(TreeNode p, TreeNode q) {
    	if(null == p && null == q)
    		return true;
        if((null == p && null != q) || (null != p && null == q)) {
        	return false;
        }
        if (p.val != q.val) 
        	return false;
        return isSameTree(p.left, q.right) && isSameTree(p.right, q.left);
    }
}