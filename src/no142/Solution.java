package no142;

import node.ListNode;

/**
 * Given a linked list, return the node where the cycle begins. If there is no cycle, return null.
 * 指针slower走1步，faster走两步，碰头时faster走的是slower的两倍距离
 * 设head到cycle开始的节点距离是x，cycle开始的节点到第一次碰头节点距离是m，第一次碰头节点到cycle开始的节点距离是n
 * 有2(x+m) = x+m+n+m  ====>  x=n;
 * 所以 设head到cycle开始的节点距离 = 第一次碰头节点到cycle开始的节点距离
 * 从head和第一次碰头节点分别开始向后找，两者第一次碰头的节点就是cycle开始的节点
 * @author psd
 *
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slower = head;
        ListNode faster = head;
        if(null == faster || null == faster.next)
        	return null;
        
        while(true) {
        	if(null == faster.next || null == faster.next.next)
        		return null;
        	faster = faster.next.next;
        	slower = slower.next;
        	if(faster == slower) {
        		faster = head;
        		while(faster != slower) {
        			faster = faster.next;
        			slower = slower.next;
        		}
        		return faster;
        	}
        }
    }
}
