package org.example.leetcode.solution._2000_3000;

import org.example.leetcode.solution.dictionaries.TestCase;
import org.example.leetcode.solution.dictionaries.Utils;

import java.util.List;

public class S_2799 {
    public static void main(String[] args) {

        List<TestCase> testCases = List.of(
                new TestCase(4, (new int[]{1, 3, 1, 2, 2}))
        );

        Utils.executeMethod("countCompleteSubarrays", testCases);

    }

    public int countCompleteSubarrays(int[] nums) {
        return 0;
    }
}