package javapractice.year2021.month07.date30;

import java.util.*;

/**
 * https://leetcode.com/problems/odd-even-jump/
 */

public class LeetCodeP0945 {
	public int oddEvenJumps(int[] arr) {

		boolean[] odd = new boolean[arr.length], even = new boolean[arr.length];
		TreeMap<Integer, Integer> treeMap = new TreeMap<>();
		int result = 0;
		int lastIndex = arr.length - 1;
		for (int i = lastIndex; i >= 0; i--) {
			if (i == lastIndex) // base condition end is always true since its already at destination
			{
				odd[i] = true;
				even[i] = true;
				treeMap.put(arr[i], i);
				result++;
				continue;
			}

			Map.Entry<Integer, Integer> oddJump = treeMap.ceilingEntry(arr[i]), evenJump = treeMap.floorEntry(arr[i]);
			if (oddJump != null) {
				odd[i] = even[oddJump.getValue()]; // when fetching next target no landing for odd jump from current,
												   // check the even of the target since that will be next jump
												   // (even/odd alternate)
			}
			if (evenJump != null) {
				even[i] = odd[evenJump.getValue()];// |||ly as above vice versa
			}
			treeMap.put(arr[i], i);
			if (odd[i]) {
				result++;
			}
		}

		return result;
	}
}
