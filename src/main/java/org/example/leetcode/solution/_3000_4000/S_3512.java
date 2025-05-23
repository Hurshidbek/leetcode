package org.example.leetcode.solution._3000_4000;

import org.example.leetcode.solution.dictionaries.TestCase;
import org.example.leetcode.solution.dictionaries.Utils;

import java.util.List;

public class S_3512 {
    public static void main(String[] args) {

        List<TestCase> testCases = List.of(
                new TestCase(4, new int[]{3, 9, 7}, 5)
        );

        Utils.executeMethod("minOperations", testCases);

    }

    public int minOperations(int[] nums, int k) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums[nums.length - 1] % k;
    }
}