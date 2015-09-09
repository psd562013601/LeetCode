package no2;

import node.ListNode;

public class Solution {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		return myAdd(l1, l2, 0);
	}

	private ListNode myAdd(ListNode l1, ListNode l2, int jingwei) {
		if (null == l1 && null == l2)
			if (jingwei > 0) {
				return new ListNode(jingwei);
			} else
				return null;
		if (null != l1 && null == l2) {
			ListNode newNode = new ListNode((l1.val + jingwei) % 10);
			int j = (l1.val + jingwei) / 10;
			if (j > 0)
				newNode.next = myAdd(new ListNode(j), l1.next, 0);
			else
				newNode.next = l1.next;
			return newNode;
		}
		if (null == l1 && null != l2) {
			ListNode newNode = new ListNode((l2.val + jingwei) % 10);
			int j = (l2.val + jingwei) / 10;
			if (j > 0)
				newNode.next = myAdd(new ListNode(j), l2.next, 0);
			else
				newNode.next = l2.next;
			return newNode;
		}
		ListNode newNode = new ListNode((l1.val + l2.val + jingwei) % 10);
		int j = (l1.val + l2.val + jingwei) / 10;
		newNode.next = myAdd(l1.next, l2.next, j);
		return newNode;
	}

	public static void main(String[] args) {
		ListNode l1 = new ListNode(0);
		ListNode l2 = new ListNode(7);
		ListNode curr = l2;
		curr.next = new ListNode(3);
		curr= curr.next;
		new Solution().addTwoNumbers(l1, l2);

	}

}
