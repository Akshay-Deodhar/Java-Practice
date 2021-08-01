package javapractice.year2021.month08.date01;

//import java.util.*;

/**
 * https://leetcode.com/problems/first-missing-positive/
 */

public class LeetCodeP0041 {
    public int firstMissingPositive(int[] nums) {
        int len = nums.length, idx;
        for (int i = 0; i < len; i++) {
            if (nums[i] <= 0) {
                nums[i] = Integer.MAX_VALUE;
            }
        }
        for (int i = 0; i < len; i++) {
            idx = Math.abs(nums[i]) - 1;
            if (idx < 0 || idx >= len) {
                continue;
            }
            if (nums[idx] < 0) {
                continue;
            }
            nums[idx] = -nums[idx];
        }
        for (int i = 0; i < len; i++) {
            if (nums[i] > 0) {
                return i + 1;
            }
        }
        return len + 1;
    }
}
