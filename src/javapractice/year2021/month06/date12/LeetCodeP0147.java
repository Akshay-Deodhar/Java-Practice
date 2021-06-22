package javapractice.year2021.month06.date12;

import javapractice.utils.ListNode;

/**
 * https://leetcode.com/problems/insertion-sort-list/
 */

public class LeetCodeP0147 {

	public ListNode insertionSortList(ListNode head) {
		if (head == null | head.next == null) {
			return head;
		}
		ListNode newHead = new ListNode(-10000);
		ListNode temp = head, tempNext;
		while (temp != null) {
			tempNext = temp.next;
			temp.next = null;
			insertNodeInList(newHead, temp);
			temp = tempNext;
		}
		return newHead.next;
	}

	private void insertNodeInList(ListNode head, ListNode node) {
		ListNode curr = head.next, prev = head;
		while (prev != null) {
			if (curr == null || curr.val >= node.val) {
				prev.next = node;
				node.next = curr;
				break;
			}
			prev = curr;
			curr = curr.next;
		}
	}
}
