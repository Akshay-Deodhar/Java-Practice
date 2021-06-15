package javapractice.year2021.month06.date15;

/**
 * https://leetcode.com/problems/minimum-elements-to-add-to-form-a-given-sum/
 */

public class LeetCodeP1785 {
	public int minElements(int[] nums, int limit, int goal) {
		long sum = 0;
		for (int num : nums) {
			sum += num;
		}
		if (goal - sum == 0) {
			return 0;
		}
		long rem = Math.abs((long) goal - sum);
		if (rem % limit == 0) {
			return (int) (rem / limit);
		}
		return 1 + (int) (rem / limit);
	}
}
