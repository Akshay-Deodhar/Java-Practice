package javapractice.year2021.month06.date06;

import java.util.Arrays;
import java.util.Comparator;

/**
 * https://leetcode.com/problems/the-k-strongest-values-in-an-array/
 */

public class LeetCodeP1471 {
    int median;

    public int[] getStrongest(int[] arr, int k) {
	int len = arr.length;
	Arrays.sort(arr);
	median = arr[(len - 1) / 2];
	Integer idxs[] = new Integer[len];
	for (int i = 0; i < len; i++) {
	    idxs[i] = Integer.valueOf(i);
	}
	Arrays.sort(idxs, new Comparator<Integer>() {
	    public int compare(Integer o1, Integer o2) {
		// Intentional: Reverse order for this demo
		if (Math.abs(arr[o1] - median) != Math.abs(arr[o2] - median)) {
		    return Math.abs(arr[o1] - median) - Math.abs(arr[o2] - median);
		} else {
		    return o1 - o2;
		}
	    }
	});
	int result[] = new int[k];
	for (int i = 0; i < k; i++) {
	    result[i] = arr[idxs[len - 1 - i]];
	}
	return result;
    }
}
