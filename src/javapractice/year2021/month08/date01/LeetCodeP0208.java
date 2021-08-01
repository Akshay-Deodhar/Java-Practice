package javapractice.year2021.month08.date01;

//import java.util.*;

/**
 * https://leetcode.com/problems/implement-trie-prefix-tree/
 */

public class LeetCodeP0208 {
}

class Trie {
    TrieNode base;
    /** Initialize your data structure here. */
    public Trie() {
        base = new TrieNode();
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode temp = base;
        int len = word.length(), idx;
        for(int i=0;i<len;i++) {
            idx = word.charAt(i) - 'a';
            if(temp.children[idx] == null) {
                temp.children[idx] = new TrieNode();
            }
            temp = temp.children[idx];
        }
        temp.word = word;
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode temp = base;
        int idx, len = word.length();
        for(int i=0;i<len;i++) {
            idx = word.charAt(i) - 'a';
            if(temp.children[idx] == null) {
                return false;
            }
            temp = temp.children[idx];
        }
        return temp.word != null;
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        TrieNode temp = base;
        int idx, len = prefix.length();
        for(int i=0;i<len;i++) {
            idx = prefix.charAt(i) - 'a';
            if(temp.children[idx] == null) {
                return false;
            }
            temp = temp.children[idx];
        }
        return temp != null;
    }
}

class TrieNode {
    public String word;
    public final TrieNode[] children;

    public TrieNode() {
        this.children = new TrieNode[26];
    }
}
