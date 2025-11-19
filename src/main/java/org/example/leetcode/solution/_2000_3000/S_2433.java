package org.example.leetcode.solution._2000_3000;

import java.util.Arrays;

public class S_2433 {
    public static void main(String[] args) {
        var solution = new S_2433();

        System.out.println(Arrays.toString(solution.findArray(new int[]{5, 2, 0, 3, 1})));
    }

    public int[] findArray(int[] pref) {
        for (int i = pref.length - 1; i > 0; i--) {
            pref[i] = pref[i - 1] ^ pref[i];
        }
        return pref;
    }
}