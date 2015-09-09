package no237;

import node.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void deleteNode(ListNode node) {
        if(null==node || null == node.next)
        	return;
        ListNode c=node;
    	node.val=node.next.val;
    	node = node.next;
        while(null != node.next) {
        	c=c.next;
        	node.val=node.next.val;
        	node = node.next;
        }
        c.next =null;
    }
}