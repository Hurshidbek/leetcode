package org.example.leetcode.solution._0_1000;

import java.util.*;

class S_416 {
    public static void main(String[] args) {
        var solution = new S_416();

        System.out.println(!solution.canPartition(new int[]{2, 2, 1, 1}));
        System.out.println(!solution.canPartition(new int[]{1, 5, 3}));
        System.out.println(solution.canPartition(new int[]{3, 3, 3, 4, 5}));
        System.out.println(solution.canPartition(new int[]{1, 5, 11, 5}));
        System.out.println(!solution.canPartition(new int[]{1, 2, 3, 5}));
    }

    public boolean canPartition(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        Set<Double> set = new HashSet<>();

        for (int i : nums) {
            sum += i;
            set.add(sum * 1.0);
        }

        return !set.add(sum / 2.0);

    }
}