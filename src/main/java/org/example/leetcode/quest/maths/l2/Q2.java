package org.example.leetcode.quest.maths.l2;

import org.example.leetcode.solution.dictionaries.Utils;

public class Q2 {
    public static void main(String[] args) {
        Q2 solution = new Q2();

        Utils.print(solution.smallestRepunitDivByK(3));
    }

    public int smallestRepunitDivByK(int k) {
        if (k % 2 == 0 || k % 5 == 0) return -1;
        int rem = 0;
        for (int len = 1; len <= k; len++) {
            rem = (rem * 10 + 1) % k;
            if (rem == 0){
                return len;
            }
        }
        return -1;
    }

}