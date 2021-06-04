package org.javapractice.june03;

/**
 * https://leetcode.com/problems/range-sum-query-mutable/
 */
class LeetCodeP0374 {
    class NumArray {
	int[] values;

	public NumArray(int[] nums) {
	    values = nums;
	}

	public void update(int i, int val) {
	    values[i] = val;
	}

	public int sumRange(int i, int j) {
	    int retVal = 0;
	    for (int k = i; k <= j; k++)
		retVal += values[k];
	    return retVal;
	}
    }
}

/**
 * Your NumArray object will be instantiated and called as such: NumArray obj =
 * new NumArray(nums); obj.update(index,val); int param_2 =
 * obj.sumRange(left,right);
 */
