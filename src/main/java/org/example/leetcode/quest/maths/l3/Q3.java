package org.example.leetcode.quest.maths.l3;

import org.example.leetcode.solution.dictionaries.Utils;

public class Q3 {
    public static void main(String[] args) {
        Q3 solution = new Q3();

        Utils.print(solution.rearrangeSticks(3, 2));
    }


    public int rearrangeSticks(int n, int k) {
        long[][] dp = new long[n + 1][k + 1];
        dp[1][1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= Math.min(i, k); j++) {
                long visible = dp[i - 1][j - 1];
                long hidden = dp[i - 1][j] * (i - 1);
                dp[i][j] = (visible + hidden) % 1000000007;
            }
        }
        return (int) dp[n][k];
    }

}