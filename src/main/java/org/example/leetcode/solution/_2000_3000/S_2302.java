package org.example.leetcode.solution._2000_3000;

import org.example.leetcode.solution.dictionaries.TestCase;
import org.example.leetcode.solution.dictionaries.Utils;

import java.util.Arrays;
import java.util.List;

public class S_2302 {
    public static void main(String[] args) {

        List<TestCase> testCases = List.of(
                new TestCase(6, new int[]{2, 1, 4, 3, 5}, 10L),
                new TestCase(5, new int[]{1, 1, 1}, 5L)
        );

        Utils.executeMethod("countSubarrays", testCases);

    }

    public long countSubarrays(int[] nums, Long k) {


        return 0;
    }
}