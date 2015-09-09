package no103;

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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    	List<List<Integer>> l = new ArrayList<>();
    	int level = 0;
        everyLevel(root, level, l);
        for(int i=1; i<l.size(); i+=2) {
        	Collections.reverse(l.get(i));
        }
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
}