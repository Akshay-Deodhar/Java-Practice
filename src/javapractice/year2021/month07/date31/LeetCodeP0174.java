package javapractice.year2021.month07.date31;

//import java.util.*;

/**
 * https://leetcode.com/problems/dungeon-game/
 */

public class LeetCodeP0174{
    public int calculateMinimumHP(int[][] dungeon) {
        int len = dungeon.length, br = dungeon[0].length;
        int[][] healthMat = new int[len][br];
        healthMat[len-1][br-1] = Math.max(1,1 - dungeon[len-1][br-1]);
        for(int i=len-2;i>=0;i--) {
            healthMat[i][br-1] = Math.max(healthMat[i+1][br-1] - dungeon[i][br-1],1);
        }
        for(int j=br-2;j>=0;j--) {
            healthMat[len-1][j] = Math.max(healthMat[len-1][j+1] - dungeon[len-1][j],1);
        }
        
        for(int i=len-2;i>=0;i--) {
            for(int j=br-2;j>=0;j--) {
                healthMat[i][j] = Math.max(
                    1,
                    Math.min(
                        healthMat[i][j+1],
                        healthMat[i+1][j]
                    ) - dungeon[i][j]
                );
            }
        }
        return healthMat[0][0];
    }
}
