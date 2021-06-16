package javapractice.year2021.month06.date16;

/**
 * https://leetcode.com/problems/search-a-2d-matrix/
 */

public class LeetCodeP0074 {
	public boolean searchMatrix(int[][] matrix, int target) {
		int length = matrix.length, breadth = matrix[0].length;
		int lo = 0, hi = length * breadth - 1;
		int mid = 0;
		int quotient, remainder;
		while (lo < hi) {
			mid = lo + (hi - lo) / 2;
			quotient = mid / breadth;
			remainder = mid % breadth;
			if (matrix[quotient][remainder] == target) {
				return true;
			} else if (matrix[quotient][remainder] > target) {
				hi = mid;
			} else {
				lo = mid + 1;
			}
		}
		quotient = lo / breadth;
		remainder = lo % breadth;
		return matrix[quotient][remainder] == target;
	}
}
