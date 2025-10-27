package org.example.leetcode.solution._1000_2000;

import java.util.Arrays;

public class S_1652 {
    public static void main(String[] args) {
        var solution = new S_1652();

        System.out.println(Arrays.toString(solution.decrypt(new int[]{5, 7, 1, 4}, 3))); // 12,10,16,13
    }

    public int[] decrypt(int[] code, int k) {

        int n = code.length;

        if (k == 0) return new int[n];

        int arr[] = new int[2 * n];

        for (int i = 0; i < n; i++) {
            arr[i] = code[i];
            arr[i + n] = code[i];
        }

        int preSum = 0;
        int[] preSumArr = new int[2 * n];

        for (int i = 0; i < 2 * n; i++) {
            preSum += arr[i];
            preSumArr[i] = preSum;
        }

        int ans[] = new int[n];

        if (k > 0) {
            for (int i = 0; i < n; i++) {
                ans[i] = preSumArr[i + k] - preSumArr[i];
            }
        } else {
            k = Math.abs(k);
            for (int i = n; i < 2 * n; i++) {
                ans[i - n] = preSumArr[i - 1] - preSumArr[i - k - 1];
            }
        }

        return ans;
    }

    public int[] decrypt2(int[] code, int k) {
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