package org.example.leetcode.solution._0_1000;

public class S_463 {
    public static void main(String[] args) {
        var solution = new S_463();

        System.out.println(solution.islandPerimeter(new int[][]{{0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}}));
    }

    public int islandPerimeter(int[][] grid) {
        int count = 0, border = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    count += grid[i][j];
                    if (i > 0) border += grid[i - 1][j];
                    if (j < grid[0].length - 1) border += grid[i][j + 1];
                    if (i < grid.length - 1) border += grid[i + 1][j];
                    if (j > 0) border += grid[i][j - 1];
                }
            }
        }
        return 4 * count - border;
    }
}