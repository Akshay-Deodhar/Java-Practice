package javapractice.year2021.month07.date26;

//import java.util.*;

/**
 * https://leetcode.com/problems/product-of-array-except-self/
 */

public class LeetCodeP0238 {
	public int[] productExceptSelf(int[] nums) {
		int len = nums.length, rightProd = 1;
		int[] products = new int[len];
		products[0] = nums[0];
		for (int i = 1; i < len; i++) {
			products[i] = products[i - 1] * nums[i];
		}
		for (int i = len - 1; i > 0; i--) {
			products[i] = products[i - 1] * rightProd;
			rightProd *= nums[i];
		}
		products[0] = rightProd;
		return products;
	}
}
