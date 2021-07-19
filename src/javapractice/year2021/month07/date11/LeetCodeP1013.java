package javapractice.year2021.month07.date11;

//import java.util.*;

/**
 * https://leetcode.com/problems/partition-array-into-three-parts-with-equal-sum/
 */

public class LeetCodeP1013 {
	public boolean canThreePartsEqualSum(int[] arr) {
		int sum = 0, len = arr.length;
		for (int i = 0; i < len; i++) {
			sum += arr[i];
		}
		if (sum % 3 != 0) {
			return false;
		}
		int target = sum / 3, part1 = -1, part2 = -1;
		sum = 0;
		for (int i = 0; i < len; i++) {
			sum += arr[i];
			if (sum == target) {
				part1 = i;
				break;
			}
		}
		if (part1 == -1) {
			return false;
		}
		sum = 0;
		for (int i = part1 + 1; i < len; i++) {
			sum += arr[i];
			if (sum == target) {
				part2 = i;
				break;
			}
		}
		return part2 != -1 && part2 != len - 1;
	}
}
