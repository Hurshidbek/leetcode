package org.example.leetcode.quest.maths.l1;

import org.example.leetcode.solution.dictionaries.Utils;

import java.util.Arrays;

public class Q1 {
    public static void main(String[] args) {
        Q1 solution = new Q1();

        Utils.print(solution.canMakeArithmeticProgression(new int[]{2, 10, 7, 8, 3}));
//        Utils.print(solution.canMakeArithmeticProgression(new int[]{0, 0, 0, 0}));
//        Utils.print(solution.canMakeArithmeticProgression(new int[]{1, 2, 4}));
//        Utils.print(solution.canMakeArithmeticProgression(new int[]{3, 5, 1}));
    }

    public boolean canMakeArithmeticProgression(int[] arr) {
        int min = 1000000, max = -1000000, sum = 0;
        for (int a : arr) {
            if (min > a) min = a;
            if (max < a) max = a;
            sum += a;
        }
        return (min + max) * arr.length / 2.0 == sum;
    }

    public boolean canMakeArithmeticProgression1(int[] arr) {
        if (arr.length < 3) return true;
        Arrays.sort(arr);
        int diff = arr[0] - arr[1];
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] - arr[i + 1] != diff) {
                return false;
            }
        }
        return true;
    }
}