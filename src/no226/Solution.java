package no226;

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
    public TreeNode invertTree(TreeNode root) {
    	if(null == root) {
    		return root;
    	}
    	TreeNode tmp = invertTree(root.left);
    	root.left = invertTree(root.right);
    	root.right = tmp;
    	return root;
    }
}