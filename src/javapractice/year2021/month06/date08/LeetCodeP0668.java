package javapractice.year2021.month06.date08;

/**
 * https://leetcode.com/problems/kth-smallest-number-in-multiplication-table/
 */

public class LeetCodeP0668 {
    public int findKthNumber(int m, int n, int k) {
	int lo = 1, hi = m * n;
	int mid = lo + (hi - lo) / 2;
	int count;
	while (lo < hi) {
	    mid = lo + (hi - lo) / 2;
	    count = getLessNbrsCount(mid, m, n);
	    // System.out.println(lo + "lo/hi" + hi + "hi/mid" + mid);
	    if (count >= k) {
		hi = mid;
	    } else {
		lo = mid + 1;
	    }
	}
	mid = lo + (hi - lo) / 2;
	return mid;
    }

    private int nbrsCount;

    private int getLessNbrsCount(int candidate, int row, int col) {
	nbrsCount = 0;
	for (int i = 1; i <= row; i++) {
	    nbrsCount += Math.min(col, candidate / i);
	}
	// System.out.println(count + " c/t " + target);
	return nbrsCount;
    }
}
