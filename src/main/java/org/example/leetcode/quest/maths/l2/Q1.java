package org.example.leetcode.quest.maths.l2;

import org.example.leetcode.solution.dictionaries.Utils;

public class Q1 {
    public static void main(String[] args) {
        Q1 solution = new Q1();

        Utils.print(solution.isUgly(0));
//        Utils.print(solution.isUgly(6));
//        Utils.print(solution.isUgly(1));
//        Utils.print(solution.isUgly(14));
    }

    int[] primes = new int[]{2, 3, 5};

    public boolean isUgly(int n) {
        if (n <= 0) return false;
        for (int prime : primes) {
            while (n % prime == 0) {
                n /= prime;
            }
        }
        return n == 1;
    }

}