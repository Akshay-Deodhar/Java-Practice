package org.javapractice.problems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * https://leetcode.com/problems/maximal-network-rank/
 * solved 03.06.2021
 * @author JJPL242-PC
 *
 */
class LeetCodeP1615 {
    public int maximalNetworkRank(int n, int[][] roads) {
        Map<Integer,Set<Integer>> roadMap = new HashMap<>();
        populateMap(n, roads, roadMap);
        int max = -1, max2 = -1, res = 0;
        for (int i = 0; i < n; i++) {
            if (max != -1) {
                int cur = roadMap.get(max).size() + roadMap.get(i).size();
                if (roadMap.get(i).contains(max)) cur--;
                res = Math.max(res, cur);
            }
            if (max2 != -1) {
                int cur = roadMap.get(max2).size() + roadMap.get(i).size();
                if (roadMap.get(i).contains(max2)) cur--;
                res = Math.max(res, cur);
            }
            if (max == -1 || roadMap.get(i).size() > roadMap.get(max).size()) {
			    max2 = max;
                max = i;
            } else if (max2 == -1 || roadMap.get(i).size() > roadMap.get(max2).size()) {
                max2 = i;
            }
        }
        return res;
    }
    
    private void populateMap(int n, int[][] roads, Map<Integer,Set<Integer>> roadmap) {
        for(int i=0;i<n;i++) {
            roadmap.put(i, new HashSet<Integer>());
        }
        for (int[] road : roads) {
            roadmap.get(road[0]).add(road[1]);
            roadmap.get(road[1]).add(road[0]);
        }
        return;
    }
}
