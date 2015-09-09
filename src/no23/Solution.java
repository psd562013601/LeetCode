package no23;

import java.util.List;
import java.util.PriorityQueue;

import node.ListNode;

/**
 * Merge k Sorted Lists
 * @author psd
 *
 */
public class Solution {
    public ListNode mergeKLists(List<ListNode> lists) {
    	PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
    	for(int i = 0; i< lists.size(); i++) {
    		ListNode curr = lists.get(i);
    		while(null != curr) {
    			pq.add(curr.val);
    			curr = curr.next;
    		}
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
