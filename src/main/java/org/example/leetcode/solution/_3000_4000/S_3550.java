package org.example.leetcode.solution._3000_4000;

import java.util.Arrays;

public class S_3550 {
    public static void main(String[] args) {
        var solution = new S_3550();

        System.out.println(solution.smallestIndex(new int[]{1, 3, 2}));
        System.out.println(solution.smallestIndex(new int[]{1, 10, 11}));
        System.out.println(solution.smallestIndex(new int[]{1, 2, 3}));
    }

    public static int smallestIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (i == digitSum(nums[i])){
                return i;
            }
        }
        return -1;
    }

    private static int digitSum(int num) {
        int digitSum = 0;
        while (num > 0){
            digitSum += num%10;
            num /= 10;
        }
        return digitSum;
    }
}