package no141;

import node.ListNode;

public class Solution {
	
    public boolean hasCycle(ListNode head) {
        ListNode slower = head;
        ListNode faster = head;
        if(null == faster)
        	return false;

        if(null == faster.next)
        	return false;
        
        while(true) {
        	if(null == faster.next)
        		return false;
        	if(null == faster.next.next)
        		return false;
        	faster = faster.next.next;
        	slower = slower.next;
        	if(faster == slower)
        		return true;
        }
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
