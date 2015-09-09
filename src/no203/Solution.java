package no203;

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
    public ListNode removeElements(ListNode head, int val) {
        ListNode newHead = new ListNode(Integer.MIN_VALUE);
        ListNode newCurr = newHead;
        ListNode curr=head;
        while(null!=curr) {
        	if(val != curr.val) {
        		newCurr.next=new ListNode(curr.val);
        		newCurr = newCurr.next;
        	}
        	curr = curr.next;
        }
        return newHead.next;
    }
}