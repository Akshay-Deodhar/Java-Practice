package javapractice.year2021.month07.date24;

import java.util.*;

/**
 * https://leetcode.com/problems/filter-restaurants-by-vegan-friendly-price-and-distance/
 */

public class LeetCodeP1333 {
	public List<Integer> filterRestaurants(int[][] restaurants, int veganFriendly, int maxPrice, int maxDistance) {
		List<int[]> filteredList = new ArrayList<>();
		for (int[] arr : restaurants) {
			if ((veganFriendly == 1 && arr[2] == 0) || arr[3] > maxPrice || arr[4] > maxDistance) {
				continue;
			}
			filteredList.add(arr);
		}
		Collections.sort(filteredList, new Comparator<int[]>() {
			public int compare(int[] a, int[] b) {
				if (a[1] == b[1]) {
					return b[0] - a[0];
				}
				return b[1] - a[1];
			}
		});
		List<Integer> result = new ArrayList<>();
		for (int i = 0; i < filteredList.size(); i++) {
			result.add(filteredList.get(i)[0]);
		}
		return result;
	}
}
