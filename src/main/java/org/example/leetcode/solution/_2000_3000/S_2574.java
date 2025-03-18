package org.example.leetcode.solution._2000_3000;

import java.util.Arrays;

class S_2574 {
    public static void main(String[] args) {
        var solution = new S_2574();

        System.out.println(Arrays.toString(solution.leftRightDifference(new int[]{10, 4, 8, 3})));
    }

    public int[] leftRightDifference(int[] nums) {
        int len = nums.length;
        int[] leftSum = new int[len];
        int[] rightSum = new int[len];

        for (int i = 1; i < len; i++) {
            leftSum[i] = leftSum[i - 1] + nums[i - 1];
            rightSum[len - 1 - i] = rightSum[len - i] + nums[len - i];
        }

        for (int i = 0; i < len; i++) {
            nums[i] = Math.abs(leftSum[i] - rightSum[i]);
        }
        return nums;
    }
}