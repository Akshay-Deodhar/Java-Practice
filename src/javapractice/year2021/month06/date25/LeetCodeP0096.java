package javapractice.year2021.month06.date25;

/**
 * https://leetcode.com/problems/unique-binary-search-trees/
 */

public class LeetCodeP0096 {
	int treeNbrs[] = new int[20];

	public int numTrees(int n) {
		treeNbrs[0] = 1;
		treeNbrs[1] = 1;
		int count = 0;
		for (int i = 2; i <= n; i++) {
			count = 0;
			for (int j = 1; j <= i; j++) {
				count += (treeNbrs[j - 1] * treeNbrs[i - j]);
			}
			// System.out.println(i+" "+count);
			treeNbrs[i] = count;
		}
		return treeNbrs[n];
	}
}
