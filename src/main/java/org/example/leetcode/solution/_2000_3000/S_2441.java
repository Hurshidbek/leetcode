package org.example.leetcode.solution._2000_3000;

import org.example.leetcode.solution.dictionaries.Bitwise;

public class S_2441 {
    public static void main(String[] args) {
        var solution = new S_2441();

//        System.out.println(solution.findMaxK(new int[]{-9, -43, 24, -23, -16, -30, -38, -30}));
//        System.out.println(solution.findMaxK(new int[]{-1, 2, -3, 3}));
        System.out.println(solution.findMaxK(new int[]{-1, 10, 6, 7, -7, 1}));
        System.out.println(solution.findMaxK(new int[]{-10, 8, 6, 7, -2, -3}));
    }

    public int findMaxK(int[] nums) {

        int[] arr = new int[1001];
        int max = -1;

        for (int i: nums) {
            int sign = 2;

            if (i < 0) {
                i *= -1;
                sign = 1;
            }

            arr[i] = (int) (arr[i] | (1L << sign));

            if (arr[i] == 6 && max < i) max = i;
        }

        return max;
    }

    public static int add(int bitmask, int num) {
        return (int) (bitmask | (1L << num));
    }
}