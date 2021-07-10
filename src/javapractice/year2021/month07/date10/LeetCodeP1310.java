package javapractice.year2021.month07.date10;

//import java.util.*;

/**
 * https://leetcode.com/problems/xor-queries-of-a-subarray/
 */

public class LeetCodeP1310 {
	public int[] xorQueries(int[] arr, int[][] queries) {
		int len = arr.length, prefix[] = new int[len], tempXor = arr[0];
		prefix[0] = tempXor;
		for (int i = 1; i < len; i++) {
			tempXor = tempXor ^ arr[i];
			prefix[i] = tempXor;
		}
		len = queries.length;
		int[] result = new int[queries.length];
		for (int i = 0; i < len; i++) {
			if (queries[i][0] == 0) {
				result[i] = prefix[queries[i][1]];
			} else {
				result[i] = prefix[queries[i][0] - 1] ^ prefix[queries[i][1]];
			}
		}
		return result;
	}
}
