package javapractice.year2021.month08.date04;

//import java.util.*;

/**
 * https://leetcode.com/problems/find-xor-sum-of-all-pairs-bitwise-and/
 */

public class LeetCodeP1835 {
	public int getXORSum(int[] arr1, int[] arr2) {
		return findXORSum(arr1) & findXORSum(arr2);
	}

	private int findXORSum(int[] arr) {
		int len = arr.length;
		int result = arr[0];
		for (int i = 1; i < len; i++) {
			result = result ^ arr[i];
		}
		return result;
	}
}
