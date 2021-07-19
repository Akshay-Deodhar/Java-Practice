package javapractice.year2021.month06.date09;

/**
 * https://leetcode.com/problems/number-of-ways-to-stay-in-the-same-place-after-some-steps/
 */

public class LeetCodeP1269 {

	private final int MOD = 1_000_000_007;

	public int numWays(int steps, int len) {
		if (len == 1) {
			return 1;
		}
		int[] curr = new int[len];
		int stepCount = 0;
		curr[0] = 1;
		while (stepCount < steps) {
			// System.out.println("step "+stepCount);
			curr = generateNextStep(curr, stepCount, steps);
			// System.arraycopy(curr,0,prev,0,len);
			stepCount++;
		}
		return curr[0];
	}

	private int[] generateNextStep(int[] prev, int stepCount, int targetSteps) {
		int len = prev.length;
		int[] curr = new int[len];
		for (int i = 0; i < len; i++) {
			curr[i] = (prev[i] + (i > 0 ? prev[i - 1] : 0)) % MOD;
			curr[i] = (curr[i] + (i < len - 1 ? prev[i + 1] : 0)) % MOD;
			if (i == targetSteps - 1 - stepCount)
				break;
			// System.out.println("array "+curr[i]);
		}
		return curr;
	}
}
