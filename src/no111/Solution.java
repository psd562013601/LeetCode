package no111;

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
    public int minDepth(TreeNode root) {
    	if(null == root) {
    		return 0;
    	}
        if(null == root.left && null == root.right) {
        	return 1;
        }
        int lmin=Integer.MAX_VALUE;
        int rmin=Integer.MAX_VALUE;
        if(null != root.left) {
        	lmin = minDepth(root.left);
        }
        if(null != root.right) {
        	rmin = minDepth(root.right);
        }
        return Math.min(lmin, rmin)+1;
    }
}