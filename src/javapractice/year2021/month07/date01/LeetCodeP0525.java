package javapractice.year2021.month07.date01;

import java.util.*;

/**
 * https://leetcode.com/problems/contiguous-array/
 */

public class LeetCodeP0525 {
    private Map<Integer, Integer> extras = null;

    public int findMaxLength(int[] nums) {
        int len = nums.length, max = 0, count = 0;
        if(len == 1) {
            return 0;
        }
        extras = new HashMap<Integer, Integer>();
        extras.put(0,-1);
        for(int i=0;i<len;i++) {
            count += (nums[i] == 1 ? 1 : -1);
            if(extras.containsKey(count)) {
                max = Math.max(max, i - extras.get(count));
            } else {
                extras.put(count, i);
            }
        }
        return max;
    }
}
