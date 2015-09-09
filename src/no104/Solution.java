package no104;

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
    public int maxDepth(TreeNode root) {
    	if(null == root) {
    		return 0;
    	}
        if(null == root.left && null == root.right) {
        	return 1;
        }
        int lmax=Integer.MIN_VALUE;
        int rmax=Integer.MIN_VALUE;
        if(null != root.left) {
        	lmax = maxDepth(root.left);
        }
        if(null != root.right) {
        	rmax = maxDepth(root.right);
        }
        return Math.max(lmax, rmax)+1;
    }
}