package org.example.leetcode.solution._2000_3000;

public class S_2017 {
    public static void main(String[] args) {
        S_2017 solution = new S_2017();

        System.out.println(63 == solution.gridGame(new int[][]{{20, 3, 20, 17, 2, 12, 15, 17, 4, 15}, {20, 10, 13, 14, 15, 5, 2, 3, 14, 3}}));
        System.out.println(4 == solution.gridGame(new int[][]{{2, 5, 4}, {1, 5, 1}}));
        System.out.println(7 == solution.gridGame(new int[][]{{1, 3, 1, 15}, {1, 3, 3, 1}}));
    }

    int max = 0;
    int[][] prefixSum;
    char[][] path;

    public long gridGame(int[][] grid) {
        long prefixSum0 = 0, prefixSum1 = 0, ans = Long.MAX_VALUE;

        for (int i : grid[0]) prefixSum0 += i;

        for (int j = 0; j < grid[0].length; ++j) {
            ans = Math.min(ans, Math.max(prefixSum0 -= grid[0][j], prefixSum1));
            prefixSum1 += grid[1][j];
        }

        return ans;
    }

    public long gridGame2(int[][] grid) {

        long ps0 = 0;
        long ps1 = 0;

        int len = grid[0].length;
        long[][] gridCopy = new long[grid.length][grid[0].length];

        for (int i = 0; i < len; i++){
            gridCopy[0][i] = grid[0][i] ;
            gridCopy[1][i] = grid[1][i] ;
        }

        for (int i = 1; i < len; i++) {
            gridCopy[1][i] += gridCopy[1][i - 1];
            gridCopy[0][len - 1 - i] += gridCopy[0][len - 1 - i + 1];
        }

        long min = Long.MAX_VALUE;
        for (int i = 0; i < len; i++) {
            long i1 = i > 0 ? gridCopy[1][i - 1] : 0L;
            long i2 = i < len - 1 ? gridCopy[0][i + 1] : 0L;
            min = Math.min(min, Math.max(i1, i2));
        }

        return min;
    }

    public void findPath(int[][] grid, int sum, int i, int j, char dir) {
        sum += grid[i][j];

        if (sum > prefixSum[i][j]) {
            prefixSum[i][j] = sum;
            path[i][j] = dir;
        }

        if (i == grid.length - 1 && j == grid[0].length - 1) {
            return;
        }

        if (i < grid.length - 1) {
            findPath(grid, sum, i + 1, j, 'u');
        }
        if (j < grid[0].length - 1) {
            findPath(grid, sum, i, j + 1, 'l');
        }
    }

    public void removePathOfFirstRobot(int[][] grid) {
        int i = grid.length - 1;
        int j = grid[0].length - 1;

        while (i >= 0 & j >= 0) {
            grid[i][j] = 0;
            if (path[i][j] == 'u')
                i--;
            else
                j--;
        }

    }

}
