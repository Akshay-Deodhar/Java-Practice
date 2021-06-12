package javapractice.year2021.month06.date09;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/keys-and-rooms/
 */

public class LeetCodeP0841 {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
	if (rooms.size() == 1) {
	    return true;
	}
	if (rooms.get(0).size() == 0) {
	    return false;
	}
	int len = rooms.size();
	boolean[] isVisited = new boolean[len];
	isVisited[0] = true;
	List<Integer> visitList = new ArrayList<Integer>();
	visitList.add(0);
	int curr;
	while (!(visitList.isEmpty())) {
	    curr = visitList.get(0);
	    // System.out.println(curr);
	    visitList.remove(0);
	    for (int i : rooms.get(curr)) {
		if (!isVisited[i]) {
		    isVisited[i] = true;
		    visitList.add(i);
		}
	    }
	}
	for (boolean b : isVisited) {
	    if (!b)
		return false;
	}
	return true;
    }
}
