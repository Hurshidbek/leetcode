package org.example.leetcode.solution._2000_3000;

import java.util.Arrays;

public class S_2373 {
    public static void main(String[] args) {
        var solution = new S_2373();

        System.out.println(Arrays.deepToString(solution.largestLocal(new int[][]{{9, 9, 8, 1}, {5, 6, 2, 6}, {8, 2, 6, 4}, {6, 2, 2, 2}})));
    }

    public int[][] largestLocal(int[][] grid) {
//        int n = grid.length;
//        int[][] maxLocal = new int[n - 2][n - 2];
//        for (int i = 0; i < n - 2; i++) {
//            for (int j = 0; j < n - 2; j++) {
//                int maxVal = 0;
//                for (int x = i; x < i + 3; x++) {
//                    for (int y = j; y < j + 3; y++) {
//                        maxVal = Math.max(maxVal, grid[x][y]);
//                    }
//                }
//                maxLocal[i][j] = maxVal;
//            }
//        }
//        return maxLocal;

        int n = grid.length;
        int[][] res = new int[n - 2][n - 2];
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res.length; j++) {
                int l = Integer.MIN_VALUE;
                for (int row = i; row < i + 3; row++) {
                    for (int col = j; col < j + 3; col++) {
                        l = Math.max(l, grid[row][col]);
                    }
                }
                res[i][j] = l;
            }
        }
        return res;
    }
}