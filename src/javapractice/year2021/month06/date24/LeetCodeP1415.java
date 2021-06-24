package javapractice.year2021.month06.date24;

import java.util.*;

/**
 * https://leetcode.com/problems/the-k-th-lexicographical-string-of-all-happy-strings-of-length-n/
 */

public class LeetCodeP1415 {
    public String getHappyString(int n, int k) {
        List<String>local = new ArrayList<>();
        int len = 0, listLen;
        String str;
        while(len<n) {
            if(len == 0) {
                local.add("a");
                local.add("b");
                local.add("c");
            } else {
                listLen = local.size();
                for(int i=0;i<listLen;i++) {
                    str = local.get(0);
                    local.remove(0);
                    for(int k2 = 0;k2<3;k2++) {
                        if(str.charAt(str.length()-1) - 'a' != k2) {
                            local.add(str + (char)('a'+k2));
                        }
                    }
                }
            }
            len++;
        }
        if(local.size()<k) {
            return "";
        }
        Collections.sort(local);
        return local.get(k-1);
    }
}
