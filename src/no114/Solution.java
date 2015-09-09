package no114;

import java.util.ArrayList;
import java.util.List;

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
public class Solution {//Not finished
    public void flatten(TreeNode root) {
    }
    
    private void preOrder(TreeNode node, List<Integer> l) {
    	if(null != node) {
    		l.add(node.val);
    		preOrder(node.left, l);
    		preOrder(node.right, l);
    	}
    }
}