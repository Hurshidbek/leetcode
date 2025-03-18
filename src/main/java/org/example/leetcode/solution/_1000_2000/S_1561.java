package org.example.leetcode.solution._1000_2000;


import org.example.leetcode.solution.dictionaries.TreeNode;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

class S_1561 {
    public static void main(String[] args) {
        var solution = new S_1561();

        System.out.println(solution.maxCoins(new int[]{9, 8, 7, 6, 5, 1, 2, 3, 4}));
    }

    public int maxCoins(int[] piles) {
        int res = 0, i = piles.length;
        Arrays.sort(piles);
        while ((i -= 2) >= piles.length / 3) {
            res += piles[i];
        }
        return res;
    }

}