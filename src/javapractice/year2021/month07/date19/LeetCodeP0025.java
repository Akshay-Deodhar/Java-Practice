package javapractice.year2021.month07.date19;

import javapractice.utils.ListNode;

//import java.util.*;

/**
 * https://leetcode.com/problems/reverse-nodes-in-k-group/
 */

public class LeetCodeP0025 {
	public ListNode reverseKGroup(ListNode head, int k) {
		if (k == 1) {
			return head;
		}
		return processList(head, k);
	}

	private ListNode processList(ListNode head, int groupSize) {
		if (head == null || head.next == null) {
			return head;
		}
		int count = 0;
		ListNode temp = head, newHead = new ListNode(0), prev = head, temp2;
		while (count < groupSize && temp != null) {
			prev = temp;
			temp = temp.next;
			count++;
		}
		if (count < groupSize) {
			return head;
		}
		prev = prev.next;
		newHead.next = processList(temp, groupSize);
		temp = head;
		while (temp != prev) {
			temp2 = temp.next;
			temp.next = newHead.next;
			newHead.next = temp;
			temp = temp2;
		}
		return newHead.next;
	}
}
