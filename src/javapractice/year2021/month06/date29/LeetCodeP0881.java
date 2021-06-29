package javapractice.year2021.month06.date29;

import java.util.*;

/**
 * https://leetcode.com/problems/boats-to-save-people/
 */

public class LeetCodeP0881 {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int right = people.length-1, left = 0, count = 0;
        while(left<=right) {
            count++;
            if(people[left] + people[right] <= limit) {
                left++;
                right--;
            } else {
                right--;
            }
        }
        return count;
    }
}
