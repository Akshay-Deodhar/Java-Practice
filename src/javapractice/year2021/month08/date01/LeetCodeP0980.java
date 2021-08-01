package javapractice.year2021.month08.date01;

//import java.util.*;

/**
 * https://leetcode.com/problems/unique-paths-iii/
 */

public class LeetCodeP0980 {
    int count = 0, len, br;
    public int uniquePathsIII(int[][] grid) {
        this.len = grid.length;
        this.br = grid[0].length;
        int startRow = -1, startCol = -1, steps = 0;
        for(int i=0;i<len;i++) {
            for(int j=0;j<br;j++) {
                if(grid[i][j] == 1) {
                    startRow = i;
                    startCol = j;
                } else if(grid[i][j] == 0) {
                    steps++;
                }
            }
        }
        processCell(grid,startRow,startCol, steps + 1);
        return count;
    }

    private void processCell(int[][] grid, int row, int col, int steps) {

        if(row < 0 || row >= len || col < 0 || col >=br) {
            return;
        }
        switch(grid[row][col]) {
            case 2:
                if(steps == 0) {
                    count++;
                }
                return;
            case 0:
                grid[row][col] = 3;
                processCell(grid, row-1,col, steps - 1);
                processCell(grid, row+1,col, steps - 1);
                processCell(grid, row,col-1, steps - 1);
                processCell(grid, row,col+1, steps - 1);
                grid[row][col] = 0;
                return;
            case 1:
                grid[row][col] = 3;
                processCell(grid, row-1,col, steps - 1);
                processCell(grid, row+1,col, steps - 1);
                processCell(grid, row,col-1, steps - 1);
                processCell(grid, row,col+1, steps - 1);
                grid[row][col] = 1;
                return;
            case 3:
                return;
            case -1:
                return;
        }
    }
}
