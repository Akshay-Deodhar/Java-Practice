package javapractice.year2021.month07.date17;

import javapractice.utils.ListNode;

//import java.util.*;

/**
 * https://leetcode.com/problems/linked-list-cycle-ii/s
 */

public class LeetCodeP0142 {
	public ListNode detectCycle(ListNode head) {
		if (head == null || head.next == null) {
			return null;
		}
		ListNode fast = head, slow = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (fast == slow) {
				break;
			}
		}
		if (fast == null || fast.next == null) {
			return null;
		}
		slow = head;
		while (fast != slow) {
			fast = fast.next;
			slow = slow.next;
		}
		return fast;
	}
}
