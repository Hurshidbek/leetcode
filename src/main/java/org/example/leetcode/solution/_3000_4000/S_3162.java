package org.example.leetcode.solution._3000_4000;

import org.example.leetcode.solution.dictionaries.TestCase;
import org.example.leetcode.solution.dictionaries.Utils;

import java.util.List;

public class S_3162 {
    public static void main(String[] args) {

        List<TestCase> testCases = List.of(
                new TestCase(5, new int[]{1,3,4}, new int[]{1,3,4}, 1)
        );

        Utils.executeMethod("numberOfPairs", testCases);

    }

    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int count = 0;
        for (int i : nums1) {
            for (int j : nums2) {
                if (i % (j * k) == 0) {
                    count++;
                }
            }
        }
        return count;
    }
}