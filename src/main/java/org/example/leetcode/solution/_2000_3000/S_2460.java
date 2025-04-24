package org.example.leetcode.solution._2000_3000;

import java.util.Arrays;

public class S_2460 {
    public static void main(String[] args) {
        var solution = new S_2460();

        System.out.println(Arrays.equals(new int[]{1, 0}, solution.applyOperations(new int[]{0, 1})));
        System.out.println(Arrays.equals(new int[]{1, 4, 2, 0, 0, 0}, solution.applyOperations(new int[]{1, 2, 2, 1, 1, 0})));
    }

    public int[] applyOperations(int[] nums) {
        int len = nums.length;
        int[] res = new int[len];
        int indRes = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                if (i < len - 1 && nums[i] == nums[i + 1]) {
                    nums[i] *= 2;
                    nums[i + 1] = 0;
                }
                res[indRes++] = nums[i];
            }
        }
        return res;
    }
}