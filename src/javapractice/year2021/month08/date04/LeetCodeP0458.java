package javapractice.year2021.month08.date04;

//import java.util.*;

/**
 * https://leetcode.com/problems/poor-pigs/
 */

public class LeetCodeP0458 {
	public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
		int trials = minutesToTest / minutesToDie;
		return (int) Math.ceil(Math.log(buckets) / Math.log(trials + 1));
	}
}
