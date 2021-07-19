package javapractice.year2021.month06.date08;

/**
 * https://leetcode.com/problems/matrix-block-sum/
 */

public class LeetCodeP1314 {
	public int[][] matrixBlockSum(int[][] mat, int k) {
		int len = mat.length;
		int bre = mat[0].length;
		int[][] sums = new int[len][bre];
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < bre; j++) {
				if (i == 0 && j == 0) {
					sums[i][j] = mat[i][j];
				} else if (i == 0) {
					sums[i][j] = sums[i][j - 1] + mat[i][j];
				} else if (j == 0) {
					sums[i][j] = sums[i - 1][j] + mat[i][j];
				} else {
					sums[i][j] = sums[i - 1][j] + sums[i][j - 1] - sums[i - 1][j - 1] + mat[i][j];
				}
				// System.out.println(sums[i][j]);
			}
		}
		// System.out.println("prefix Sums set. setting matrix.");
		int tl = 0, tr = 0, bl = 0, br = 0;
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < bre; j++) {
				// System.out.println(i + " funny " + j);
				// setting tl
				if (i - k - 1 < 0 | j - k - 1 < 0) {
					tl = 0;
				} else {
					tl = sums[i - k - 1][j - k - 1];
				}

				// setting br
				br = sums[Math.min(i + k, len - 1)][Math.min(j + k, bre - 1)];

				// setting tr
				if (j - k - 1 < 0) {
					tr = 0;
				} else {
					tr = sums[Math.min(i + k, len - 1)][j - k - 1];
				}

				// setting bl
				if (i - k - 1 < 0) {
					bl = 0;
				} else {
					bl = sums[i - k - 1][Math.min(j + k, bre - 1)];
				}

				mat[i][j] = tl + br - tr - bl;
			}
		}
		return mat;
	}
}
