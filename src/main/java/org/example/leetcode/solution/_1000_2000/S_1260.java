package org.example.leetcode.solution._1000_2000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S_1260 {
    public static void main(String[] args) {
        var solution = new S_1260();

        System.out.println(solution.shiftGrid(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, 1));
        System.out.println(solution.shiftGrid(new int[][]{{1}, {2}, {3}, {4}, {7}, {6}, {5}}, 23));
    }

    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length, n = grid[0].length;
        int[][] ans = new int[m][n];
        k = m * n - (k % (m * n));
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ans[i][j] = grid[(i + (j + k) / n) % m][(j + k) % n];
            }
        }
        return (List) Arrays.asList(ans);
    }

    public List<List<Integer>> shiftGrid2(int[][] grid, int k) {
        int m = grid.length, n = grid[0].length;
        k = m * n - (k % (m * n));
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                list.add(grid[(i + (j + k) / n) % m][(j + k) % n]);
            }
            res.add(list);
        }
        return res;
    }
}