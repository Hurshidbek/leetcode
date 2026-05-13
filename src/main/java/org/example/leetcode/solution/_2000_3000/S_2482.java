package org.example.leetcode.solution._2000_3000;

import java.util.Arrays;

public class S_2482 {
    public static void main(String[] args) {
        var solution = new S_2482();

        System.out.println(Arrays.deepToString(solution.onesMinusZeros(new int[][]{{0, 1, 1}, {1, 0, 1}, {0, 0, 1}})));
    }

    public int[][] onesMinusZeros(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int[] row = new int[m], col = new int[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                row[i] += grid[i][j];
                col[j] += grid[i][j];
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = 2 * (row[i] + col[j]) - m - n;
            }
        }
        return grid;
    }
}