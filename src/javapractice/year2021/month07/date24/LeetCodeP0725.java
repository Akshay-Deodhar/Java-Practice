package javapractice.year2021.month07.date24;

import javapractice.utils.ListNode;

//import java.util.*;

/**
 * https://leetcode.com/problems/split-linked-list-in-parts/
 */

public class LeetCodeP0725 {
	public ListNode[] splitListToParts(ListNode head, int k) {
		int count = 0, quo, rem, limit;
		ListNode temp = head, temp2 = head, prev = head;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		System.out.println(count);
		quo = count / k;
		rem = count % k;
		ListNode[] result = new ListNode[k];
		temp = head;
		for (int i = 0; i < k; i++) {
			limit = i < rem ? quo + 1 : quo;
			if (limit == 0) {
				continue;
			}
			for (int j = 0; j < limit; j++) {
				prev = temp;
				temp = temp.next;
			}
			result[i] = temp2;
			temp2 = temp;
			prev.next = null;
		}
		return result;
	}
}
