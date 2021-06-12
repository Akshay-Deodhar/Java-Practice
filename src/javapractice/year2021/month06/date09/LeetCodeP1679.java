package javapractice.year2021.month06.date09;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/max-number-of-k-sum-pairs/
 */

public class LeetCodeP1679 {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int start = 0, end = nums.length-1;
        int count = 0;
        while(start<end) {
            if (nums[start] + nums[end] == k) {
                count++;
                start++;
                end--;
            } else if(nums[start] + nums[end]>k) {
                end--;
            } else {
                start++;
            }
        }
        return count;
    }
}
