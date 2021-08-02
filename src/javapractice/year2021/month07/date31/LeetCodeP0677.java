package javapractice.year2021.month07.date31;

//import java.util.*;

/**
 * https://leetcode.com/problems/map-sum-pairs/
 */

public class LeetCodeP0677 {
}

class MapSum {

	private TrieNode base;
	private int count;

	/** Initialize your data structure here. */
	public MapSum() {
		base = new TrieNode();
		count = 0;
	}

	public void insert(String key, int val) {
		TrieNode temp = base;
		int len = key.length(), idx;
		for (int i = 0; i < len; i++) {
			idx = key.charAt(i) - 'a';
			if (temp.children[idx] == null) {
				temp.children[idx] = new TrieNode();
			}
			temp = temp.children[idx];
		}
		temp.setVal(val);
		return;
	}

	public int sum(String prefix) {
		this.count = 0;
		int len = prefix.length(), idx;
		TrieNode temp = base;
		for (int i = 0; i < len; i++) {
			idx = prefix.charAt(i) - 'a';
			if (temp.children[idx] == null) {
				return 0;
			}
			temp = temp.children[idx];
		}
		processSum(temp);
		return this.count;
	}

	private void processSum(TrieNode root) {
		if (root == null) {
			return;
		}
		this.count += root.getVal();
		for (TrieNode child : root.children) {
			processSum(child);
		}
		return;
	}
}

class TrieNode {
	private int val;
	public TrieNode[] children;

	public TrieNode() {
		this.val = 0;
		this.children = new TrieNode[26];
	}

	public void setVal(int p_val) {
		this.val = p_val;
	}

	public int getVal() {
		return this.val;
	}
}
