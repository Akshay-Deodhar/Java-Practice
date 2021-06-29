package javapractice.year2021.month06.date29;

import javapractice.utils.ListNode;

import java.util.*;

/**
 * https://leetcode.com/problems/linked-list-components/
 */

public class LeetCodeP0817 {
	public int numComponents(ListNode head, int[] nums) {
		int len = nums.length, count = 0;
		boolean isConnStarted = false;
		if (head == null || len == 0) {
			return 0;
		}
		ListNode temp = head;
		// Arrays.sort(nums);
		List<Integer> x = new ArrayList<>();
		for (int i : nums) {
			x.add(i);
		}
		while (temp != null) {
			if (isConnStarted) {
				if (!x.contains(temp.val)) {
					count++;
					isConnStarted = false;
				}
			} else {
				if (x.contains(temp.val)) {
					isConnStarted = true;
				}
			}
			temp = temp.next;
		}
		if (isConnStarted) {
			count++;
		}
		return count;
	}
}
