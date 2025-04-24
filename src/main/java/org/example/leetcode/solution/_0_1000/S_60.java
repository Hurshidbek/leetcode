package org.example.leetcode.solution._0_1000;

import java.util.LinkedList;
import java.util.List;

public class S_60 {
    public static void main(String[] args) {
        var solution = new S_60();

        System.out.println(solution.getPermutation(4, 9));
    }

    public String getPermutation(int n, int k) {
        int[] factorial = new int[n];
        factorial[0] = 1;
        for (int i = 1; i < n; i++) {
            factorial[i] = factorial[i - 1] * i;
        }

        List<Integer> nums = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            nums.add(i);
        }

        StringBuilder sb = new StringBuilder();

        k--;

        for (int ind = n-1; ind > 0; ind--){
            int butun = k / factorial[ind];
            sb.append(nums.remove(butun));
            k %= factorial[ind];
        }

        return sb.toString();
    }
}