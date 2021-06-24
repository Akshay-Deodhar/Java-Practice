package javapractice.year2021.month06.date24;

import java.util.*;

/**
 * https://leetcode.com/problems/last-stone-weight/
 */

public class LeetCodeP1046 {
    public int lastStoneWeight(int[] stones) {
        List<Integer> list = new ArrayList<Integer>();
        for(int stone: stones) {
            list.add(stone);
        }
        int max, nextMax;
        while(list.size() > 1) {
            Collections.sort(list, Collections.reverseOrder());
            max = list.get(0);
            list.remove(0);
            nextMax = list.get(0);
            list.remove(0);
            if(max != nextMax) {
                list.add(max-nextMax);
            }
        }
        return list.size() == 1 ? list.get(0): 0;
    }
}
