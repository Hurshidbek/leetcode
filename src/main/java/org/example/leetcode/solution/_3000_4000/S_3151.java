package org.example.leetcode.solution._3000_4000;

import java.util.Arrays;

public class S_3151 {
    public static void main(String[] args) {
        var solution = new S_3151();

        System.out.println(solution.isArraySpecial(new int[]{2, 1, 4}));
        System.out.println(!solution.isArraySpecial(new int[]{1, 5}));
        System.out.println(!solution.isArraySpecial(new int[]{4, 3, 1, 6}));
    }

    public boolean isArraySpecial(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] % 2 == nums[i + 1] % 2) {
                return false;
            }
        }
        return true;
    }
}