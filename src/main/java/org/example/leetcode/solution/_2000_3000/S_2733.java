package org.example.leetcode.solution._2000_3000;

import java.util.Arrays;

public class S_2733 {
    public static void main(String[] args) {
        var solution = new S_2733();

        System.out.println(solution.findNonMinOrMax(new int[]{3,2,1,4}));
    }

    static {
        for (int i = 0; i < 500; i++) {
            findNonMinOrMax(new int[0]);
        }
    }

    public static int findNonMinOrMax(int[] nums) {
        return nums.length < 3 ? -1
                : nums[0] > nums[1] && nums[0] < nums[2] || nums[0] < nums[1] && nums[0] > nums[2] ? nums[0]
                : nums[1] > nums[0] && nums[1] < nums[2] || nums[1] < nums[0] && nums[1] > nums[2] ? nums[1]
                : nums[2];
    }
}