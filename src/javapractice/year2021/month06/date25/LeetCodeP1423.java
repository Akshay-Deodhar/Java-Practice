package javapractice.year2021.month06.date25;

/**
 * https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/
 */

public class LeetCodeP1423 {
	public int maxScore(int[] cardPoints, int k) {
		int len = cardPoints.length, sum = 0, min = Integer.MAX_VALUE;
		int left = 0, right = len - k, subArraySum = 0;
		for (int i = 0; i < len; i++) {
			if (i < len - k) {
				subArraySum += cardPoints[i];
			}
			sum += cardPoints[i];
		}
		min = Math.min(min, subArraySum);
		while (right < len) {
			subArraySum += (cardPoints[right] - cardPoints[left]);
			min = Math.min(min, subArraySum);
			left++;
			right++;
		}
		return sum - min;
	}
}
