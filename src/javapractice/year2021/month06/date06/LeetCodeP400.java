package javapractice.year2021.month06.date06;

/**
 * https://leetcode.com/problems/nth-digit/
 */

public class LeetCodeP400 {
    public int findNthDigit(int n) {
	if (n <= 9)
	    return n;
	int countLeft = n;
	int nbrDigits = 1;
	int first = 1;
	long totalNbrs = 9;
	int pos;
	int total = 0;
	while (countLeft > (totalNbrs * nbrDigits)) {
	    total += (totalNbrs * nbrDigits);
	    countLeft -= (totalNbrs * nbrDigits);
	    System.out.println(total + " " + countLeft + " " + n);
	    nbrDigits++;
	    totalNbrs *= 10;
	    first *= 10;
	}
	first = first + (countLeft - 1) / nbrDigits;
	pos = (countLeft - 1) % nbrDigits;
	char ch = Integer.toString(first).charAt(pos);
	return Character.getNumericValue(ch);
    }
}
