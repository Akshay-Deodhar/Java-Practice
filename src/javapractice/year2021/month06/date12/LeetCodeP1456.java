package javapractice.year2021.month06.date12;

/**
 * https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/
 */

public class LeetCodeP1456 {
	public int maxVowels(String s, int k) {
		int len = s.length();
		int maxCount = Integer.MIN_VALUE;
		int count = 0;
		int i;
		for (i = 0; i < k; i++) {
			if (isCharVowel(s.charAt(i))) {
				count++;
			}
		}
		maxCount = Math.max(maxCount, count);
		// System.out.println(i);
		while (i < len) {
			if (isCharVowel(s.charAt(i)))
				count++;
			if (isCharVowel(s.charAt(i - k)))
				count--;
			maxCount = Math.max(count, maxCount);
			i++;
		}
		return maxCount;
	}

	private boolean isCharVowel(char ch) {
		return ch == 'a' | ch == 'e' | ch == 'i' | ch == 'o' | ch == 'u';
	}

}
