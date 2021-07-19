package javapractice.year2021.month06.date04;

/**
 * https://leetcode.com/problems/string-without-aaa-or-bbb/
 */

public class LeetCodeP0984 {
	String letterA = "a", letterB = "b";

	public String strWithout3a3b(int a, int b) {
		String result = "";
		int diff;
		if (a > b) {
			diff = a - b;
			for (int i = 0; i < b; i++)
				result += (letterA + letterB);
			result += letterA;
			for (int i = 0; i < diff - 1; i++) {
				result = result.replaceFirst(letterA, "xx");
			}
			result = result.replace("xx", "aa");
			return result;
		} else if (a < b) {
			diff = b - a;
			for (int i = 0; i < a; i++)
				result += (letterB + letterA);
			result += letterB;
			for (int i = 0; i < diff - 1; i++) {
				result = result.replaceFirst(letterB, "xx");
			}
			result = result.replace("xx", "bb");
			return result;

		} else {
			for (int i = 0; i < a + b; i++) {
				if (i % 2 == 0) {
					result += letterA;
				} else {
					result += letterB;
				}
			}
			return result;
		}
	}
}
