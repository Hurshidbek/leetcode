package org.example.leetcode.quest.maths.l3;

import org.example.leetcode.solution.dictionaries.Utils;

import java.util.ArrayList;
import java.util.List;

public class Q1 {
    public static void main(String[] args) {
        Q1 solution = new Q1();

        Utils.print(solution.getPermutation(4, 7)); // 2314
    }

    int[] factorial = new int[]{1, 1, 2, 6, 24, 120, 720, 5040, 40320};
    public String getPermutation(int n, int k) {

        StringBuilder sb = new StringBuilder();

        List<Integer> nums = new ArrayList<>();
        for (int i = 1; i <= n; i++) nums.add(i);

        k--;
        while (k > 0) {
            int whole = k / factorial[--n];
            sb.append(nums.remove(whole));
            k %= factorial[n];
        }

        for (int i : nums) sb.append(i);

        return sb.toString();
    }

}