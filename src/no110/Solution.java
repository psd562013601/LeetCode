package no110;

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
    public boolean isBalanced(TreeNode root) {
    	if(null == root) {
    		return true;
    	}
        if(isBalanced(root.left) && isBalanced(root.right)) {
        	return Math.abs(maxDepth(root.left) - maxDepth(root.right)) <= 1;
        }
        else
        	return false;
    }
    
    private int maxDepth(TreeNode root) {
    	if(null == root) {
    		return 0;
		}
		int lmax = Integer.MIN_VALUE;
		int rmax = Integer.MIN_VALUE;
		lmax = maxDepth(root.left);
		rmax = maxDepth(root.right);
		return Math.max(lmax, rmax) + 1;
	}
}