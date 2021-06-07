package org.javapractice.june07;

/**
 * https://leetcode.com/problems/masking-personal-information/
 */

public class LeetCodeP0831 {
    private final String EMAIL_MASK = "*****";
    private final String NBR_MASK_MAIN = "***-";

    public String maskPII(String s) {
	if (s.contains("@")) {
	    return maskEmail(s);
	} else {
	    return maskPhNbr(s);
	}
    }

    private String maskPhNbr(String nbr) {
	String rawNbr = "", result = "";
	int len = nbr.length();
	char ch;
	for (int i = 0; i < len; i++) {
	    ch = nbr.charAt(i);
	    if (ch >= '0' && ch <= '9') {
		rawNbr += ch;
	    }
	}
	System.out.println(rawNbr);
	len = rawNbr.length();
	result += rawNbr.substring(len - 4, len);
	len -= 4;
	if (len == 6) {
	    return NBR_MASK_MAIN + NBR_MASK_MAIN + result;
	} else {
	    while (len >= 3) {
		result = NBR_MASK_MAIN + result;
		len -= 3;
	    }
	    ;

	    result = ((len != 0) ? "-" : "") + result;
	    while (len > 0) {
		result = "*" + result;
		len--;
	    }
	    return "+" + result;
	}
    }

    private String maskEmail(String email) {
	int len;
	String firstSplit[] = email.split("@");
	firstSplit[0] = firstSplit[0].toLowerCase();
	firstSplit[1] = firstSplit[1].toLowerCase();
	len = firstSplit[0].length();
	firstSplit[0] = firstSplit[0].substring(0, 1) + EMAIL_MASK + firstSplit[0].substring(len - 1, len);
	return String.join("@", firstSplit);
    }
}
