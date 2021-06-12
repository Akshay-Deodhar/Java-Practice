package javapractice.year2021.month06.date09;

/**
 * https://leetcode.com/problems/reverse-words-in-a-string/
 */

public class LeetCodeP0151 {
    public String reverseWords(String s) {
	s = s.trim();
	if (!(s.contains(" "))) {
	    return s;
	}
	String[] words = s.split(" ");
	s = "";
	int len = words.length;
	for (int i = 0; i < len; i++) {
	    if (words[len - 1 - i].isEmpty())
		continue;
	    s += ((s.equals("") ? "" : " ") + words[len - 1 - i].trim());
	}
	return s;
    }
}
