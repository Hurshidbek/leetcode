package org.example.leetcode.solution._2000_3000;

import java.util.HashMap;
import java.util.Map;

class S_2537 {
    public static void main(String[] args) {
        var solution = new S_2537();

        System.out.println(12 == solution.countGood(new int[]{1, 2, 2, 3, 3, 4}, 1));
        System.out.println(4 == solution.countGood(new int[]{3, 1, 4, 3, 2, 2, 4}, 2));
        System.out.println(1 == solution.countGood(new int[]{1, 1, 1, 1, 1}, 10));
        System.out.println(2 == solution.countGood(new int[]{1, 1, 1, 1, 1, 2}, 10));
        System.out.println(4 == solution.countGood(new int[]{3, 1, 4, 3, 2, 2, 4}, 2));
        System.out.println(4 == solution.countGood(new int[]{1, 2, 2, 3}, 1));
        System.out.println(5 == solution.countGood(new int[]{1, 1, 4, 4}, 1));
        System.out.println(8 == solution.countGood(new int[]{1, 2, 3, 2, 3, 4}, 1));
    }

    public long countGood(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        int count = 0, pairCount = 0;
        int len = nums.length, left = 0;

        for (int right = 0; right < len; right++) {
            pairCount += freq.merge(nums[right], 1, Integer::sum) - 1;
            while (pairCount >= k) {
                count += len - right;
                pairCount -= freq.merge(nums[left++], -1, Integer::sum);
            }
        }

        return count;
    }

}