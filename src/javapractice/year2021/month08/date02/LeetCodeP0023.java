package javapractice.year2021.month08.date02;

import javapractice.utils.ListNode;

//import java.util.*;

/**
 * https://leetcode.com/problems/merge-k-sorted-lists/
 */

public class LeetCodeP0023 {
	public ListNode mergeKLists(ListNode[] lists) {
		return recursiveMerge(lists, 0, lists.length - 1);
	}

	private ListNode recursiveMerge(ListNode[] lists, int start, int end) {
		if (start > end) {
			return null;
		}
		if (start == end) {
			return lists[start];
		}
		int mid = start + (end - start) / 2;
		ListNode first = recursiveMerge(lists, start, mid);
		ListNode second = recursiveMerge(lists, mid + 1, end);
		return mergeTwoLists(first, second);
	}

	private ListNode mergeTwoLists(ListNode first, ListNode second) {
		ListNode newHead = new ListNode(0), temp = newHead;
		while (first != null && second != null) {
			if (first.val <= second.val) {
				temp.next = first;
				first = first.next;
			} else {
				temp.next = second;
				second = second.next;
			}
			temp = temp.next;
		}
		if (first != null || second != null) {
			temp.next = (first != null) ? first : second;
		}
		return newHead.next;
	}
}
