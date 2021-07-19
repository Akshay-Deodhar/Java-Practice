package javapractice.year2021.month07.date03;

import java.util.*;

/**
 * https://leetcode.com/problems/design-front-middle-back-queue/
 */

public class LeetCodeP1670 {
}

class FrontMiddleBackQueue {

	private List<Integer> impl;
	private int size;

	public FrontMiddleBackQueue() {
		impl = new ArrayList<Integer>();
		size = 0;
	}

	public void pushFront(int val) {
		impl.add(0, val);
		size++;
		return;
	}

	public void pushMiddle(int val) {
		impl.add(size % 2 == 0 ? size / 2 : (size - 1) / 2, val);
		size++;
		return;
	}

	public void pushBack(int val) {
		impl.add(val);
		size++;
	}

	public int popFront() {
		if (size == 0) {
			return -1;
		}
		int x = impl.get(0);
		impl.remove(0);
		size--;
		return x;
	}

	public int popMiddle() {
		if (size == 0) {
			return -1;
		}
		int x = impl.get((size - 1) / 2);
		impl.remove((size - 1) / 2);
		size--;
		return x;
	}

	public int popBack() {
		if (size == 0) {
			return -1;
		}
		int x = impl.get(size - 1);
		impl.remove(size - 1);
		size--;
		return x;
	}
}

/**
 * Your FrontMiddleBackQueue object will be instantiated and called as such:
 * FrontMiddleBackQueue obj = new FrontMiddleBackQueue(); obj.pushFront(val);
 * obj.pushMiddle(val); obj.pushBack(val); int param_4 = obj.popFront(); int
 * param_5 = obj.popMiddle(); int param_6 = obj.popBack();
 */
