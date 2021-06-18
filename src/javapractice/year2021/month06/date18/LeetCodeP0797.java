package javapractice.year2021.month06.date18;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/all-paths-from-source-to-target/
 */

public class LeetCodeP0797 {
	private List<List<Integer>> result = new ArrayList<List<Integer>>();
	private ArrayList<Integer> path = new ArrayList<Integer>();

	public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
		processNode(graph, 0, 0);
		return result;
	}

	@SuppressWarnings("unchecked")
	private void processNode(int[][] graph, int pathSize, int index) {
		path.add(index);
		pathSize++;
		if (index == graph.length - 1) {
			// addPathToResult();
			result.add((List<Integer>) path.clone());
		} else {
			for (int nextIdx : graph[index]) {
				processNode(graph, pathSize, nextIdx);
			}
		}
		path.remove(pathSize - 1);
		pathSize--;
		return;
	}
}
