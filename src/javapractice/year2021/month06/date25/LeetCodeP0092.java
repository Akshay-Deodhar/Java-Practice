package javapractice.year2021.month06.date25;

import javapractice.utils.ListNode;

/**
 * https://leetcode.com/problems/reverse-linked-list-ii/
 */

public class LeetCodeP0092 {
	public ListNode reverseBetween(ListNode head, int left, int right) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode newHead = new ListNode(-1, head);
		ListNode temp = newHead, leftPrev = newHead, reverseList = new ListNode(-1), reverseTail = new ListNode(5000),
				temp2;
		int count = 0;
		while (count < left) {
			System.out.println(temp.val);
			leftPrev = temp;
			temp = temp.next;
			count++;
		}
		while (count <= right) {
			// System.out.println(temp.val);
			temp2 = temp.next;
			// System.out.println(temp2.val);
			if (reverseList.next == null) {
				reverseTail = temp;
			}
			temp.next = reverseList.next;
			reverseList.next = temp;
			temp = temp2;
			count++;
		}
		leftPrev.next = reverseList.next;
		reverseTail.next = temp;
		return newHead.next;
	}
}
