package javapractice.year2021.month07.date19;

import java.util.*;

import javapractice.utils.ListNode;

/**
 * https://leetcode.com/problems/reorder-list/
 */

public class LeetCodeP0143 {
	public void reorderList(ListNode head) {
		List<ListNode> list = new ArrayList<>();
		int count = 0, i = 0, j;
		ListNode newHead = new ListNode(0), temp = head;
		while (temp != null) {
			list.add(temp);
			count++;
			temp = temp.next;
		}
		j = count - 1;
		temp = newHead;
		while (i < j) {
			temp.next = list.get(i);
			temp = temp.next;
			temp.next = list.get(j);
			temp = temp.next;
			i++;
			j--;
		}
		if (i == j) {
			temp.next = list.get(i);
			temp = temp.next;
		}
		temp.next = null;
		return;
	}
}
