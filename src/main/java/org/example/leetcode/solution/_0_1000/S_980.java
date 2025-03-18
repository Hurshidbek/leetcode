package org.example.leetcode.solution._0_1000;

class S_980 {
    public static void main(String[] args) {
        var solution = new S_980();

        System.out.println(solution.uniquePathsIII(new int[][]{{1, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 2, -1}}));
    }

    public int uniquePathsIII(int[][] grid) {
        for (int[] i : grid) {
            for (int j : i) {
                if (j == 0) {
                    max++;
                }
            }
        }

        helper(grid, 0, 0, 0);

        return res;
    }

    int max = 1;
    int res = 0;

    private void helper(int[][] grid, int count, int i, int j) {
        if (i < 0 || j < 0 || i == grid.length || j == grid[0].length || grid[i][j] == -1) {
            return;
        }
        if (count == max && grid[i][j] == 2) {
            res++;
        }

        helper(grid, count + 1, i + 1, j);
        helper(grid, count + 1, i - 1, j);
        helper(grid, count + 1, i, j + 1);
        helper(grid, count + 1, i, j - 1);


    }

}