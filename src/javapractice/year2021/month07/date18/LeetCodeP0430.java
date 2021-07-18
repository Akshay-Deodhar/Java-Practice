package javapractice.year2021.month07.date18;

import java.util.*;

/**
 * https://leetcode.com/problems/flatten-a-multilevel-doubly-linked-list/
 */

public class LeetCodeP0430 {
	private Deque<Node> stack = new ArrayDeque<Node>();

	public Node flatten(Node head) {
		processList(head);
		// System.out.println(stack.size());
		Node newHead = new Node(), temp;
		newHead.val = 1234;
		while (!stack.isEmpty()) {
			temp = stack.pop();
			temp.next = newHead.next;
			if (temp.next != null) {
				temp.next.prev = temp;
			}
			temp.child = null;
			// temp.prev = null;
			newHead.next = temp;
		}
		temp = newHead;
		return newHead.next;
	}

	private void processList(Node head) {
		Node temp = head;
		while (temp != null) {
			stack.push(temp);
			if (temp.child != null) {
				processList(temp.child);
			}
			temp = temp.next;
		}
		return;
	}
}

class Node {
	public int val;
	public Node prev;
	public Node next;
	public Node child;
};
