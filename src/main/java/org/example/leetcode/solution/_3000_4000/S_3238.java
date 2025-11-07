package org.example.leetcode.solution._3000_4000;

import java.util.HashMap;
import java.util.Map;

public class S_3238 {
    public static void main(String[] args) {
        var solution = new S_3238();

        System.out.println(solution.winningPlayerCount(3, new int[][]{{1, 3}, {2, 10}}));
        System.out.println(solution.winningPlayerCount(2, new int[][]{{0, 8}, {0, 3}}));
        System.out.println(solution.winningPlayerCount(4, new int[][]{{0, 0}, {1, 0}, {1, 0}, {2, 1}, {2, 1}, {2, 0}}));
    }

    public int winningPlayerCount(int n, int[][] pick) {
        boolean[] check = new boolean[n];
        int[][] players = new int[n][11];
        int res = 0;
        for (int[] a : pick) {
            if (!check[a[0]] && players[a[0]][a[1]]++ == a[0]) {
                res++;
                check[a[0]] = true;
            }
        }
        return res;
    }
}