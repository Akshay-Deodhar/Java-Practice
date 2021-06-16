package javapractice.year2021.month06.date16;

import java.util.Arrays;
import java.util.Comparator;

/**
 * https://leetcode.com/problems/valid-square/
 */

public class LeetCodeP0593 {
	public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
		int[][] points = new int[][] { p1, p2, p3, p4 };
		Arrays.sort(points, new Comparator<int[]>() {
			public int compare(int[] x, int[] y) {
				return x[0] == y[0] ? x[1] - y[1] : x[0] - y[0];
			}
		});
		if (isArrayEqual(points[0], points[1]) | isArrayEqual(points[1], points[2])
				| isArrayEqual(points[2], points[3])) {
			return false;
		}

		int side;
		side = getSquaredLength(points[0], points[1]);
		if (side != getSquaredLength(points[1], points[3]) | side != getSquaredLength(points[2], points[3])
				| side != getSquaredLength(points[2], points[0])) {
			return false;
		}
		if (getSquaredLength(points[1], points[2]) != getSquaredLength(points[0], points[3])) {
			return false;
		}
		return true;
	}

	private int getSquaredLength(int[] point1, int[] point2) {
		return (point1[0] - point2[0]) * (point1[0] - point2[0]) + (point1[1] - point2[1]) * (point1[1] - point2[1]);
	}

	private boolean isArrayEqual(int[] x, int[] y) {
		return (x[0] == y[0]) & (x[1] == y[1]);
	}

}
