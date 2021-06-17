package javapractice.year2021.month06.date17;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/design-browser-history/
 */

class BrowserHistory {
	private final List<String> urls;
	private int size;
	private int pos;

	public BrowserHistory(String homepage) {
		urls = new ArrayList<String>();
		urls.add(homepage);
		size = 1;
		pos = 0;
	}

	public void visit(String url) {
		while (size != pos + 1) {
			urls.remove(size - 1);
			size--;
		}
		urls.add(url);
		pos++;
		size++;
	}

	public String back(int steps) {
		int min = Math.min(steps, pos);
		pos -= min;
		return urls.get(pos);
	}

	public String forward(int steps) {
		int min = Math.min(steps, size - 1 - pos);
		pos += min;
		return urls.get(pos);
	}
}

public class LeetCodeP1472 {
}
