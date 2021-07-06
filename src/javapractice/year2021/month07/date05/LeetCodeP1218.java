package javapractice.year2021.month07.date05;

import java.util.*;

/**
 * https://leetcode.com/problems/longest-arithmetic-subsequence-of-given-difference/
 */

public class LeetCodeP1218 {
    public int longestSubsequence(int[] arr, int difference) {
        Map<Integer, Integer> counts = new HashMap<> ();
        int newCount;
        for(int i:arr) {
            newCount = 1 + counts.getOrDefault(i-difference, 0);
            counts.put(i, newCount);
        }
        return Collections.max(counts.values());
    }
}
