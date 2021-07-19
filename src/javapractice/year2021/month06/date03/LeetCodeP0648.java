package javapractice.year2021.month06.date03;

import java.util.List;

/**
 * https://leetcode.com/problems/replace-words/
 */

class TrieNode {
	String val = "";
	TrieNode[] children = new TrieNode[26];
}

class LeetCodeP0647 {
	public String replaceWords(List<String> dictionary, String sentence) {
		String[] words = sentence.split(" ");
		StringBuilder sb = new StringBuilder();
		TrieNode root = new TrieNode();
		build(root, dictionary);
		for (int i = 0; i < words.length; i++) {
			TrieNode cur = root;
			String tempStr = words[i];
			for (char ch : words[i].toCharArray()) {
				if (cur.children[ch - 'a'] == null) {
					break;
				}
				cur = cur.children[ch - 'a'];
				if (!cur.val.equals("")) {
					tempStr = cur.val;
					break;
				}
			}
			sb.append(tempStr + (i == words.length - 1 ? "" : " "));
		}
		return sb.toString();
	}

	private void build(TrieNode root, List<String> dictionary) {
		for (String word : dictionary) {
			TrieNode cur = root;
			for (char ch : word.toCharArray()) {
				if (cur.children[ch - 'a'] == null) {
					cur.children[ch - 'a'] = new TrieNode();
				}
				cur = cur.children[ch - 'a'];
			}
			cur.val = word;
		}
	}
}
