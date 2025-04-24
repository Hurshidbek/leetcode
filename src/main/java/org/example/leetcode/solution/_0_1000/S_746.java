package org.example.leetcode.solution._0_1000;

import java.util.List;

public class S_746 {
    public static void main(String[] args) {
        S_746 solution = new S_746();

        List<int[]> list = List.of(
                new int[]{1, 3, 2},
                new int[]{1, 2},
                new int[]{7, 6, 4, 5, 3, 2, 1},
                new int[]{1, 2, 3, 5, 4, 6, 7},
                new int[]{2, 3, 1},
                new int[]{3, 2, 1},
                new int[]{1, 1, 5}
        );

        for (int[] nums : list) solution.minCostClimbingStairs(nums);
    }

    public int minCostClimbingStairs(int[] cost) {
        for (int i = 2; i < cost.length; i++) {
            if (cost[i - 1] >= cost[i - 2]) {
                cost[i] += cost[i - 2];
            } else {
                cost[i] += cost[i - 1];
            }
        }

        return Math.min(cost[cost.length - 1], cost[cost.length - 2]);

    }
}