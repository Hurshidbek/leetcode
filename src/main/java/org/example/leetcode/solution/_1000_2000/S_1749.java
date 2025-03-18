package org.example.leetcode.solution._1000_2000;

import org.example.leetcode.solution.dictionaries.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

class S_1749 {
    public static void main(String[] args) {
        var solution = new S_1749();

        System.out.println(solution.maxAbsoluteSum(new int[]{1, -3, 2, 3, -4}));
    }

    public int maxAbsoluteSum(int[] nums) {
        int sum = 0, min = 0, max = 0;
        for (int num : nums) {
            sum += num;
            if (sum > max) max = sum;
            if (sum < min) min = sum;
        }
        return Math.abs(max - min);
    }

    public int maxAbsoluteSum1(int[] nums) {
        int max = 0, maxSub = 0, min = 0, minSub = 0;

        for (int num : nums) {
            maxSub = Math.max(num, maxSub + num);
            max = Math.max(max, maxSub);

            minSub = Math.min(num, minSub + num);
            min = Math.min(min, minSub);
        }

        return Math.max(max, Math.abs(min));
    }
}