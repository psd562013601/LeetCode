package no21;

import java.util.PriorityQueue;

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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        ListNode curr = l1;
        while(null!= curr) {
        	pq.add(curr.val);
        	curr = curr.next;
        }
        curr = l2;
        while(null!= curr) {
        	pq.add(curr.val);
        	curr = curr.next;
        }
        
        if(pq.isEmpty())
        	return null;
        ListNode ret = new ListNode(pq.poll());
    	ListNode tail = ret;
    	while(!pq.isEmpty()) {
    		tail.next = new ListNode(pq.poll());
    		tail = tail.next;
    	}
    	return ret;
        
        
    }
}
