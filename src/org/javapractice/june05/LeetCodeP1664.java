package org.javapractice.june05;

/**
 * https://leetcode.com/problems/ways-to-make-a-fair-array/
 */

public class LeetCodeP1664 {
    public int waysToMakeFair(int[] nums) {
        if (nums.length == 1) {
            return 1;
        }
        if(nums.length == 2) {
            return 0;
        }
        int len = nums.length;
        int oddSums[] = new int[len], evenSums[] = new int[len];
        int sum = nums[0];
        evenSums[0] = nums[0];
        for(int i=1;i<len;i++) {
            sum += nums[i];
            if(i%2 == 0) {
                evenSums[i] = evenSums[i-1] + nums[i];
                oddSums[i] = oddSums[i-1];
            } else {
                evenSums[i] = evenSums[i-1];
                oddSums[i] = oddSums[i-1] + nums[i];
            }
        }
        int count = 0;
        int newEvenSum, newOddSum;
        for(int i = 0; i < len; i++) {
            if((sum - nums[i])%2 != 0) {
                continue;
            }
            if(i==0) {
                if (evenSums[len-1] - nums[0] == oddSums[len-1]) {
                    count++;
                }
            } else {
                newEvenSum = evenSums[i-1] + oddSums[len-1] - oddSums[i];
                newOddSum = oddSums[i-1] + evenSums[len-1] - evenSums[i];
                if(newEvenSum == newOddSum) {
                    count++;
                }
            }
        }
        return count;
    }
}
