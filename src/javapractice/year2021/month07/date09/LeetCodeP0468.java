package javapractice.year2021.month07.date09;

//import java.util.*;

/**
 * https://leetcode.com/problems/validate-ip-address/
 */

public class LeetCodeP0468 {
	public String validIPAddress(String IP) {
		if (isValidIpv4Address(IP)) {
			return "IPv4";
		}
		if (isValidIpv6Address(IP)) {
			return "IPv6";
		}
		return "Neither";
	}

	private boolean isValidIpv4Address(String address) {
		int len = address.length(), tempInt, count = 0;
		char ch;
		for (int i = 0; i < len; i++) {
			ch = address.charAt(i);
			// System.out.println(ch);
			if (ch == '.') {
				count++;
				continue;
			}
			if (ch > '9' || ch < '0') {
				return false;
			}
		}
		if (count != 3) {
			return false;
		}
		String[] components = address.split("\\.");
		if (components.length != 4) {
			return false;
		}
		for (String s : components) {
			// System.out.println("funny "+ s + " funny");
			if (s.length() > 3 || s.length() == 0) {
				return false;
			}
			tempInt = Integer.parseInt(s);
			if (tempInt < 0 || tempInt > 255) {
				return false;
			}
			if (tempInt == 0 & s.length() != 1) {
				return false;
			}
			;
			if (!Integer.toString(tempInt).equals(s)) {
				return false;
			}
		}
		return true;
	}

	private boolean isValidIpv6Address(String address) {
		int len = address.length(), count = 0;
		char ch;
		for (int i = 0; i < len; i++) {
			ch = address.charAt(i);
			if (ch == ':') {
				count++;
				continue;
			}
			if ((ch <= '9' & ch >= '0') || (ch <= 'F' & ch >= 'A') || (ch <= 'f' & ch >= 'a')) {
				continue;
			}
			return false;
		}
		if (count != 7) {
			return false;
		}
		String[] components = address.split(":");
		if (components.length != 8) {
			return false;
		}
		for (String s : components) {
//			System.out.println("funny " + s + " funny");
			if (s.length() > 4 || s.length() == 0) {
				return false;
			}
		}
		return true;
	}
}
