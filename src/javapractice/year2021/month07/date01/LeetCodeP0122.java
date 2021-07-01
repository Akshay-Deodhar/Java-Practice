package javapractice.year2021.month07.date01;

//import java.util.*;

/**
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
 */

public class LeetCodeP0122 {
    public int maxProfit(int[] prices) {
        int len = prices.length, profit = 0;
        int i;
        for (i=1;i<len;i++) {
            if(prices[i-1]<prices[i]) {
                profit += prices[i] - prices[i-1];
            }
        }
        return profit;
    }
}
