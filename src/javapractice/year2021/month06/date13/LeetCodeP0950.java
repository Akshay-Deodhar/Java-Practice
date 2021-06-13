package javapractice.year2021.month06.date13;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/reveal-cards-in-increasing-order/
 */

public class LeetCodeP0950 {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        if(deck.length <= 2) {
            return deck;
        }

        int len = deck.length;
        int[] shuffledDeck = new int[len];
        boolean isUsed[] = new boolean[len], skip = false;
        int cIdx = 0, arrIdx = 0;
        while(arrIdx < len) {
            if(isUsed[cIdx]) {
                cIdx = (cIdx+1)%len;
            } else {
                if(skip) {
                    skip = false;
                    cIdx = (cIdx+1)%len;
                } else {
                    isUsed[cIdx] = true;
                    shuffledDeck[cIdx] = arrIdx;
                    arrIdx++;
                    skip = true;
                    cIdx = (cIdx+1)%len;
                }
            }
        }
        for(int i=0;i<len;i++) {
            shuffledDeck[i] = deck[shuffledDeck[i]];
        }
        return shuffledDeck;
    }

}
