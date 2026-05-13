package org.example.leetcode.solution._2000_3000;

import java.util.HashSet;
import java.util.Set;

public class S_2442 {
    public static void main(String[] args) {
        var solution = new S_2442();

        System.out.println(solution.countDistinctIntegers(new int[]{1, 13, 10, 12, 31}));
    }

    public int countDistinctIntegers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int reverse = this.reverse(nums[i]);
            if (set.add(nums[i])) {
                count++;
            }
            if (set.add(reverse)) {
                count++;
            }
        }
        return count;
    }

    public int reverse(int num) {
        int a = 0;
        while (num > 0) {
            a = a * 10 + num % 10;
            num /= 10;
        }
        return a;
    }
}