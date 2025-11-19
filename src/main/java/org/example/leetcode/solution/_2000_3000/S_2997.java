package org.example.leetcode.solution._2000_3000;

import org.example.leetcode.solution.dictionaries.TestCase;
import org.example.leetcode.solution.dictionaries.Utils;

import java.util.Arrays;
import java.util.List;

public class S_2997 {
    public static void main(String[] args) {
        var question = new S_2997();

        System.out.println(question.minOperations(new int[]{2, 1, 3, 4}, 1));
    }

    public int minOperations(int[] nums, int k) {
        return Integer.bitCount(Arrays.stream(nums).reduce(k, (a, b) -> a ^ b));
    }
}