package no257;

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
public class Solution {
	public List<String> binaryTreePaths(TreeNode root) {
		List<String> ls = new ArrayList<>();
		if (null == root) {
			return ls;
		}
		String s = String.valueOf(root.val);
		this.pathsArray(root, s, ls);
		return ls;
	}

	private void pathsArray(TreeNode node, String s, List<String> ls) {
		if (null == node.left && null == node.right) {
			ls.add(s);
			return;
		}
		if (null != node.left) {
			String s1 = s + "->" + String.valueOf(node.left.val);
			pathsArray(node.left, s1, ls);
		}
		if (null != node.right) {
			String s1 = s + "->" + String.valueOf(node.right.val);
			pathsArray(node.right, s1, ls);
		}

	}
}