package javapractice.year2021.month07.date03;

import java.util.*;

/**
 * https://leetcode.com/problems/divide-array-in-sets-of-k-consecutive-numbers/
 */

public class LeetCodeP1296 {
    private List<Integer> handList = new ArrayList<>();
    public boolean isPossibleDivide(int[] hand, int groupSize) {
        handList.clear();
        if(groupSize==1) {
            return true;
        }

        int len = hand.length, nbrHands = len/groupSize, min, val;
        if(len%groupSize != 0) {
            return false;
        }
        TreeMap<Integer, Integer> counts = new TreeMap<>();
        for(int i: hand) {
            counts.put(i, 1 + counts.getOrDefault(i, 0));
        }
        for(int i=0;i<nbrHands;i++) {
            min = counts.firstKey();
            for(int j=min;j<min+groupSize;j++) {
                if(!counts.containsKey(j)) {
                    return false;
                } else {
                    val = counts.get(j);
                    if(val == 1) {
                        counts.remove(j);
                    } else {
                        counts.put(j, val-1);
                    }
                }
            }
        }
        return true;
    }
}
