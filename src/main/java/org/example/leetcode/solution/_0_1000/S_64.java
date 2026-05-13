package org.example.leetcode.solution._0_1000;

import org.example.leetcode.solution.dictionaries.TestCase;
import org.example.leetcode.solution.dictionaries.Utils;

import java.util.List;

public class S_64 {
    public static void main(String[] args) {
        var question = new S_64();

        System.out.println(question.minPathSum(new int[][]{{1, 3, 1}, {1, 5, 1}, {4, 2, 1}}));
    }

    public int minPathSum(int[][] grid) {

        int row = grid.length - 1;
        int col = grid[0].length - 1;

        for (int i = 1; i <= row; i++) {
            grid[i][0] += grid[i - 1][0];
        }

        for (int i = 1; i <= col; i++) {
            grid[0][i] += grid[0][i - 1];
        }

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                grid[i][j] += Math.min(grid[i - 1][j], grid[i][j - 1]);
            }
        }

        return grid[row][col];
    }

}