package javapractice.year2021.month07.date17;

//import java.util.*;

/**
 * https://leetcode.com/problems/average-waiting-time/
 */

public class LeetCodeP1701 {
	public double averageWaitingTime(int[][] customers) {
		int timeFree = 0;
		double waitTime = 0;
		int len = customers.length;
		for (int[] cust : customers) {
			if (cust[0] > timeFree) {
				waitTime += cust[1];
				timeFree = cust[0] + cust[1];
			} else {
				waitTime += (timeFree + cust[1] - cust[0]);
				timeFree = timeFree + cust[1];
			}
		}
		return waitTime / len;
	}
}
