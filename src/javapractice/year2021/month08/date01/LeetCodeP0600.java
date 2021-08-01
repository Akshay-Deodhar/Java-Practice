package javapractice.year2021.month08.date01;

//import java.util.*;

/**
 * https://leetcode.com/problems/non-negative-integers-without-consecutive-ones/
 */

public class LeetCodeP0600 {
    private static final int[] counts = new int[32];

    {
        populateCounts();
    }

    public int findIntegers(int n) {
        int total = 0, idx = 30, prev = 0;
        while(idx>=0) {
            if((n & (1<<idx)) == 0) {
                prev = 0;
            } else {
                total += counts[idx];
                if(prev == 1) {
                    total--;
                    break;
                }
                prev = 1;
            }
            idx--;
        }
        return 1 + total;
    }

    private static void populateCounts() {
        counts[0] = 1;
        counts[1] = 2;
        for(int i=2;i<32;i++) {
            counts[i] = counts[i-1] + counts[i-2];
        }
        return;
    }
}
