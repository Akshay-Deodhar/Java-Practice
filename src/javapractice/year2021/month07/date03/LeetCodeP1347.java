package javapractice.year2021.month07.date03;

import java.util.*;

/**
 * https://leetcode.com/problems/minimum-number-of-steps-to-make-two-strings-anagram/
 */

public class LeetCodeP1347 {
    public int minSteps(String s, String t) {
        if(s.equals(t)) {
            return 0;
        }
        int len = s.length();
        int[] counts = new int[26];
        Arrays.fill(counts, 0);
        char ch;
        int diffCount = 0;
        for(int i=0;i<len;i++) {
            ch = s.charAt(i);
            counts[ch-'a']++;
            ch = t.charAt(i);
            counts[ch-'a']--;
        }
        for(int i:counts) {
            if(i>0)
                diffCount += i;
        }
        return diffCount;
    }
}
