package org.javapractice.june04;

import java.util.ArrayList;

/**
 * https://leetcode.com/problems/queries-on-a-permutation-with-key/
 */

public class LeetCodeP1409 {
    ArrayList<Integer> perm = new ArrayList<Integer>();
    int[] result;

    @SuppressWarnings("deprecation")
    public int[] processQueries(int[] queries, int m) {
	result = new int[queries.length];
	populateList(m);
	for (int i = 0; i < queries.length; i++) {
	    System.out.println(queries[i]);
	    result[i] = perm.indexOf(queries[i]);
	    perm.remove(new Integer(queries[i]));
	    perm.add(0, queries[i]);
	    System.out.println(perm);
	}
	return result;
    }

    private void populateList(int size) {
	perm.clear();
	for (int i = 0; i < size; i++) {
	    System.out.print(i + 1);
	    perm.add(i + 1);
	}
	System.out.println();
    }
}
