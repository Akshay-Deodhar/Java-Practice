package javapractice.year2021.month07.date31;

//import java.util.*;

/**
 * https://leetcode.com/problems/median-of-two-sorted-arrays/
 */

public class LeetCodeP0004 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length, len2 = nums2.length, i=0,j=0,k=0;
        int[] merged = new int[len1 + len2];
        while(i<len1 && j<len2) {
            if(nums1[i]<= nums2[j]) {
                merged[k++] = nums1[i++];
            } else {
                merged[k++] = nums2[j++];
            }
        }
        while(i<len1) {
            merged[k++] = nums1[i++];
        }
        while(j<len2) {
            merged[k++] = nums2[j++];
        }
        if((len1 + len2)%2==1) {
            return merged[(len1+len2)/2];
        } else {
            return (double)(merged[(len1+len2)/2-1] + merged[(len1+len2)/2])/2;
        }
    }
}
