package javapractice.year2021.month07.date19;

import java.util.*;

/**
 * https://leetcode.com/problems/k-closest-points-to-origin/
 */

public class LeetCodeP0973 {
	public int[][] kClosest(int[][] points, int k) {
		Arrays.sort(points, new Comparator<int[]>() {
			public int compare(int[] a, int[] b) {
				int adist = a[0] * a[0] + a[1] * a[1];
				int bdist = b[0] * b[0] + b[1] * b[1];
				return adist - bdist;
			}
		});
		int[][] result = new int[k][2];
		for (int i = 0; i < k; i++) {
			result[i][0] = points[i][0];
			result[i][1] = points[i][1];
		}
		return result;
	}
}
