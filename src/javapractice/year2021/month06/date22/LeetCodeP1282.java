package javapractice.year2021.month06.date22;

import java.util.*;

/**
 * https://leetcode.com/problems/group-the-people-given-the-group-size-they-belong-to/
 */

public class LeetCodeP1282 {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> groups = new ArrayList<>();
        Map<Integer,List<Integer>> counts = new HashMap<>();
        int len = groupSizes.length;
        for(int i = 0; i < len; i++) {
            if(!counts.containsKey(groupSizes[i])) {
                counts.put(groupSizes[i], new ArrayList<Integer>());
            }
            counts.get(groupSizes[i]).add(i);
            if(counts.get(groupSizes[i]).size() == groupSizes[i]) {
                groups.add(counts.get(groupSizes[i]));
                counts.put(groupSizes[i], new ArrayList<Integer>());
            }
        }
        return groups;
    }
}
