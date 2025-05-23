package org.example.leetcode.solution._1000_2000;

import java.util.Arrays;

public class S_1652 {
    public static void main(String[] args) {
        var solution = new S_1652();

        System.out.println(Arrays.toString(solution.decrypt(new int[]{5, 7, 1, 4}, 3))); // 12,10,16,13
    }

    public int[] decrypt(int[] code, int k) {
        int len = code.length;
        int[] res = new int[len];

        if (k == 0) {
            return res;
        }

        int l = 0;
        int curSum = 0;

        for (int r = 0; r < len + Math.abs(k); r++) {
            curSum += code[r % len];

            if (r - l + 1 > Math.abs(k)) {
                curSum -= code[l % len];
                l = (l + 1) % len;
            }

            if (r - l + 1 == Math.abs(k)) {
                if (k > 0) {
                    res[(l - 1 + len) % len] = curSum;
                } else {
                    res[(r + 1) % len] = curSum;
                }
            }
        }

        return res;
    }
}