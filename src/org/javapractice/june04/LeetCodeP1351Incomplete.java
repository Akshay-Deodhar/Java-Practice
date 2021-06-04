package org.javapractice.june04;

public class LeetCodeP1351Incomplete {
    public int countNegatives(int[][] grid) {
	int count = 0;
	boolean isCounted;
	for (int[] row : grid) {
	    isCounted = false;
	    if (row[row.length - 1] >= 0) {
		continue;
	    }
	    if (row[0] < 0) {
		count += (row.length);
		continue;
	    } else if (row[0] == 0) {
		count += (row.length - 1);
		continue;
	    } else {
		int lo = 0, hi = row.length - 1;
		int mid = lo + (hi - lo) / 2;
		while (lo < hi) {
		    mid = lo + (hi - lo) / 2;
		    if (row[mid] >= 0) {
			if (row[mid + 1] < 0) {
			    isCounted = true;
			    count += (row.length - mid - 1);
			    break;
			}
			lo = mid + 1;
		    } else {
			if (row[mid - 1] >= 0) {
			    isCounted = true;
			    count += (row.length - mid);
			    break;
			}
			hi = mid;
		    }
		}
		mid = lo + (hi - lo) / 2;
		if (!isCounted)
		    count += (row.length - mid);
	    }
	}
	return count;
    }
}
