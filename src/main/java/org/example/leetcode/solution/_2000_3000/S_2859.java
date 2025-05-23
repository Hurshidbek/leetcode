package org.example.leetcode.solution._2000_3000;

import org.example.leetcode.solution.dictionaries.TestCase;
import org.example.leetcode.solution.dictionaries.Utils;

import java.util.Arrays;
import java.util.List;

public class S_2859 {
    public static void main(String[] args) {

        List<TestCase> testCases = List.of(
                new TestCase(1, Arrays.asList(5, 10, 1, 5, 2), 0),
                new TestCase(13, Arrays.asList(5, 10, 1, 5, 2), 1)
        );

        Utils.executeMethod("sumIndicesWithKSetBits", testCases);

    }

    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (Integer.bitCount(i) == k) {
                sum += nums.get(i);
            }
        }
        return sum;
    }
}