package javapractice.year2021.month06.date24;

import java.util.*;

/**
 * https://leetcode.com/problems/majority-element-ii/
 */

public class LeetCodeP0229 {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int len = nums.length, threshold = len / 3;
        Map<Integer, Integer> counts = new HashMap<>();
        for(int i:nums) {
            counts.put(i, counts.getOrDefault(i,0) + 1);
        }
        for(int i: counts.keySet()) {
            if(counts.get(i) > threshold) {
                result.add(i);
            }
        }
        return result;
    }
}
