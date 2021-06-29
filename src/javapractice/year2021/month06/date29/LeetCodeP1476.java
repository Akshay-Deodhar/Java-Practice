package javapractice.year2021.month06.date29;

/**
 * https://leetcode.com/problems/subrectangle-queries/
 */

public class LeetCodeP1476 {
}

class SubrectangleQueries {
    private int[][] rectangle;

    public SubrectangleQueries(int[][] p_rectangle) {
        this.rectangle = p_rectangle;
    }
    
    public void updateSubrectangle(
        int row1, 
        int col1, 
        int row2, 
        int col2, 
        int newValue
    ) {
        for(int i=row1;i<=row2;i++) {
            for(int j=col1;j<=col2;j++) {
                this.rectangle[i][j] = newValue;
            }
        }
    }
    
    public int getValue(int row, int col) {
        return this.rectangle[row][col];
    }
}
