package javapractice.year2021.month07.date11;

import java.util.*;

/**
 * https://leetcode.com/problems/minimum-moves-to-equal-array-elements-ii/
 */

public class LeetCodeP0462 {
    public int minMoves2(int[] nums) {
        int len = nums.length, result = 0;
        if(len == 1) {
            return 0;
        }
        Arrays.sort(nums);
        int left = 0, right = len-1;
        while(left<right) {
            result += (nums[right] - nums[left]);
            left++;
            right--;
        }
        return result;
    }
}
