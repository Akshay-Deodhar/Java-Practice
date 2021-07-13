package javapractice.year2021.month07.date13;

//import java.util.*;

/**
 * https://leetcode.com/problems/angle-between-hands-of-a-clock/
 */

public class LeetCodeP1344 {
	public double angleClock(int hour, int minutes) {
		double angle = 30 * hour;
		for (int i = 0; i < minutes; i++) {
			angle -= 5.5;
		}
		if (angle < 0) {
			angle += 360;
		}
		if (angle > 180) {
			angle = 360 - angle;
		}
		return angle;
	}
}
