package org.example.leetcode.solution._2000_3000;

import org.example.leetcode.solution.dictionaries.Utils;

public class S_2428 {
    public static void main(String[] args) {
        var question = new S_2428();

        Utils.print(question.maxSum(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
    }

    public int maxSum2(int[][] grid) {
        int res = 0;
        for (int i = 1; i < grid.length - 1; i++) {
            for (int j = 1; j < grid[0].length - 1; j++) {

                int sum = grid[i][j]
                        + grid[i - 1][j - 1] + grid[i - 1][j] + grid[i - 1][j + 1]
                        + grid[i + 1][j - 1] + grid[i + 1][j] + grid[i + 1][j + 1];
                res = Math.max(res, sum);
            }
        }
        return res;
    }

    // 2D prefix sum
    public int maxSum(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int[][] sum = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sum[i][j] = grid[i][j];
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 1; j < col; j++) {
                sum[i][j] = sum[i][j] + sum[i][j - 1];
            }
        }

        for (int j = 0; j < col; j++) {
            for (int i = 1; i < row; i++) {
                sum[i][j] = sum[i][j] + sum[i - 1][j];
            }
        }

        int max = 0;
        for (int i = 2; i < row; i++) {
            for (int j = 2; j < col; j++) {
                max = Math.max(max, getSum(grid, i, j, sum));
            }
        }

        return max;
    }

    private int getSum(int[][] grid, int i, int j, int[][] sum) {
        int left = j - 3;
        int up = i - 3;

        int total = sum[i][j];
        int leftSum = (left >= 0) ? sum[i][left] : 0;
        int upSum = (up >= 0) ? sum[up][j] : 0;
        int leftUpDiagonal = (left >= 0 && up >= 0) ? sum[up][left] : 0;

        return total - leftSum - upSum + leftUpDiagonal - (grid[i - 1][j] + grid[i - 1][j - 2]);
    }
}