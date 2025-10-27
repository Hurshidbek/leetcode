package org.example.leetcode.solution._2000_3000;

import java.util.Arrays;

public class S_2500 {
    public static void main(String[] args) {
        var solution = new S_2500();

        System.out.println(solution.deleteGreatestValue(new int[][]{{4, 2, 1}, {3, 3, 1}}));
    }

    public int deleteGreatestValue(int[][] grid) {

        for (int[] arr : grid) {
            Arrays.sort(arr);
        }

        int sum = 0;
        for (int j = 0; j < grid[0].length; j++) {
            int max = 0;
            for (int i = 0; i < grid.length; i++) {
                max = Math.max(max, grid[i][j]);
            }
            sum += max;
        }

        return sum;
    }
}