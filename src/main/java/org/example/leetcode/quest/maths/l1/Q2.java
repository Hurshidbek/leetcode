package org.example.leetcode.quest.maths.l1;

import org.example.leetcode.solution.dictionaries.Utils;

public class Q2 {
    public static void main(String[] args) {
        Q2 solution = new Q2();

        Utils.print(solution.pivotInteger(8));
        Utils.print(solution.pivotInteger(4));
    }

    public int pivotInteger(int n) {
        double sqrt = Math.sqrt(n * (n + 1) / 2.0);
        return sqrt == (int) sqrt ? (int) sqrt : -1;
    }
}