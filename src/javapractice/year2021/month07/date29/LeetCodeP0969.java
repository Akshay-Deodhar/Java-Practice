package javapractice.year2021.month07.date29;

import java.util.*;

/**
 * https://leetcode.com/problems/pancake-sorting/
 */

public class LeetCodeP0969 {
	public List<Integer> pancakeSort(int[] arr) {
		List<Integer> result = new ArrayList<Integer>();
		int len = arr.length;
		for (int i = len - 1; i >= 0; i--) {
			if (arr[i] == i + 1) {
				continue;
			}
			for (int j = 0; j < i; j++) {
				if (arr[j] == i + 1) {
					kFlip(arr, j);
					result.add(j + 1);
					kFlip(arr, i);
					result.add(i + 1);
					break;
				}
			}
		}
		return result;
	}

	private void kFlip(int[] nums, int k) {
		int temp, start = 0, end = k;
		while (start < end) {
			temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;
		}
	}
}
