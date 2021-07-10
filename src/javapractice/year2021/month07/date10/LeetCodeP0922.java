package javapractice.year2021.month07.date10;

//import java.util.*;

/**
 * https://leetcode.com/problems/sort-array-by-parity-ii/
 */

public class LeetCodeP0922 {
    public int[] sortArrayByParityII(int[] nums) {
        int len=nums.length, i=0, j = 1,newArr[] = new int[len];
        for(int idx =0;idx<len;idx++) {
            if(nums[idx]%2 == 0) {
                newArr[i] = nums[idx];
                i+=2;
            } else {
                newArr[j] = nums[idx];
                j+=2;                
            }
        }
        return newArr;
    }
}
