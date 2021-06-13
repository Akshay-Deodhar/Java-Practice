package javapractice.year2021.month06.date12;

/**
 * https://leetcode.com/problems/insertion-sort-list/
 */

public class LeetCodeP0147 {
	// public ListNode insertionSortList(ListNode head) {
	// if(head == null | head.next == null) {
	// return head;
	// }
	// List<Integer> list = new ArrayList<Integer>();
	// ListNode temp = head;
	// while(temp != null) {
	// list.add(temp.val);
	// temp = temp.next;
	// }
	// Collections.sort(list);
	// temp = head;
	// int i=0;
	// while(temp!=null) {
	// temp.val = list.get(i);
	// i++;
	// temp = temp.next;
	// }
	// return head;
	// }

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

class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}
