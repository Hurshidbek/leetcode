package org.example.leetcode.solution._2000_3000;

import java.util.*;

public class S_2146 {
    public static void main(String[] args) {
        var solution = new S_2146();

//        System.out.println(solution.highestRankedKItems(new int[][]{{1, 2, 0, 1}, {1, 3, 0, 1}, {0, 2, 5, 1}}, new int[]{2, 5}, new int[]{0, 0}, 3));
        System.out.println(solution.highestRankedKItems(new int[][]{{1, 1, 1}, {0, 0, 1}, {2, 3, 4}}, new int[]{2, 3}, new int[]{0, 0}, 3));
    }

    int[][] directions = new int[][]{{0, -1}, {-1, 0}, {0, 1}, {1, 0}};


    public List<List<Integer>> highestRankedKItems(int[][] grid, int[] pricing, int[] start, int k) {
        int m = grid.length, n = grid[0].length;
        boolean[][] checked = new boolean[grid.length][grid[0].length];
        List<int[]> list = new ArrayList<>(); // dist, price, row, col


        Collections.sort(list, (a, b) -> {
            if (a[0] != b[0]) return a[0] - b[0];        // distance asc
            if (a[1] != b[1]) return a[1] - b[1];        // price asc
            if (a[2] != b[2]) return a[2] - b[2];        // row asc
            return a[3] - b[3];                          // col asc
        });

        k = Math.min(k, list.size());
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            res.add(List.of(list.get(i)[2], list.get(i)[3]));
        }

        return res;
    }

}
