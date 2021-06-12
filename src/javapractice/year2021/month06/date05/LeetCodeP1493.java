package javapractice.year2021.month06.date05;

/**
 * https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element/
 */

public class LeetCodeP1493 {
    public int longestSubarray(int[] nums) {
	String s = "";
	for (int k : nums) {
	    s += k;
	}
	if (!(s.contains("0"))) {
	    return s.length() - 1;
	}
	if (!(s.contains("1"))) {
	    return 0;
	}
	String[] oneStrings = s.split("0");
	int[] lengths = new int[oneStrings.length];
	for (int i = 0; i < oneStrings.length; i++) {
	    lengths[i] = oneStrings[i].length();
	    System.out.println(lengths[i]);
	}
	if (lengths.length == 1) {
	    return lengths[0];
	}
	int maxLen = Integer.MIN_VALUE;
	for (int i = 1; i < lengths.length; i++) {
	    maxLen = Math.max(maxLen, lengths[i] + lengths[i - 1]);
	}
	return maxLen;
    }

}
