package no107;

import java.util.ArrayList;
import java.util.Collections;
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
public class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
    	List<List<Integer>> l = new ArrayList<>();
    	int level = 0;
        everyLevel(root, level, l);
        Collections.reverse(l);
        return l;
    }
    
    private void everyLevel(TreeNode node, int level, List<List<Integer>> l) {
    	if(null != node) {
    		if(l.size()<=level) {
    			l.add(level, new ArrayList<Integer>());
    		}
    		l.get(level).add(node.val);
    		this.everyLevel(node.left, level+1, l);;
    		this.everyLevel(node.right, level+1, l);
    	}
    	else {
    		return;
    	}
    }
    
    public static void main(String[] args) {
    	TreeNode root = new TreeNode(1);
    	new Solution().levelOrderBottom(root);
	}
}