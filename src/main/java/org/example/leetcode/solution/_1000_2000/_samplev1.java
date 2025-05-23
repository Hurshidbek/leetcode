package org.example.leetcode.solution._1000_2000;

import java.util.Arrays;

public class _samplev1 {
    public static void main(String[] args) {
        var solution = new _samplev1();

        System.out.println(solution.minimumAverage(new int[]{7, 8, 3, 4, 15, 13, 4, 1}));
    }

    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        double min = 50;

        for (int i = 0; i < nums.length / 2; i++) {
            min = Math.min(min, (nums[i] + nums[nums.length - 1 - i]) / 2.0);
        }

        return min;
    }
}