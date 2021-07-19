package javapractice.year2021.month07.date01;

import java.util.*;

/**
 * https://leetcode.com/problems/design-linked-list/
 */

public class LeetCodeP0707 {
}

class MyLinkedList {
	private List<Integer> impl;
	private int size;

	/** Initialize your data structure here. */
	public MyLinkedList() {
		impl = new ArrayList<Integer>();
		size = 0;
	}

	/**
	 * Get the value of the index-th node in the linked list. If the index is
	 * invalid, return -1.
	 */
	public int get(int index) {
		if (index < 0 || index >= size) {
			return -1;
		}
		return impl.get(index);
	}

	/**
	 * Add a node of value val before the first element of the linked list. After
	 * the insertion, the new node will be the first node of the linked list.
	 */
	public void addAtHead(int val) {
		impl.add(0, val);
		size++;
		return;
	}

	/** Append a node of value val to the last element of the linked list. */
	public void addAtTail(int val) {
		impl.add(val);
		size++;
		return;
	}

	/**
	 * Add a node of value val before the index-th node in the linked list. If index
	 * equals to the length of linked list, the node will be appended to the end of
	 * linked list. If index is greater than the length, the node will not be
	 * inserted.
	 */
	public void addAtIndex(int index, int val) {
		if (index < 0 || index > size) {
			return;
		}
		if (index == size) {
			impl.add(val);
			size++;
		} else {
			impl.add(index, val);
			size++;
		}
	}

	/** Delete the index-th node in the linked list, if the index is valid. */
	public void deleteAtIndex(int index) {
		if (index < 0 || index >= size) {
			return;
		}
		impl.remove(index);
		size--;
		return;
	}
}