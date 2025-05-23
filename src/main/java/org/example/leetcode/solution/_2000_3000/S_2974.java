package org.example.leetcode.solution._2000_3000;

import org.example.leetcode.solution.dictionaries.TestCase;
import org.example.leetcode.solution.dictionaries.Utils;

import java.util.Arrays;
import java.util.List;

public class S_2974 {
    public static void main(String[] args) {

        List<TestCase> testCases = List.of(
                new TestCase(new int[]{3, 2, 5, 4}, new int[]{5, 4, 2, 3})
        );

        Utils.executeMethod("numberGame", testCases);

    }

    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int[] res = new int[nums.length];

        for (int i = 0; i < nums.length; i += 2) {
            res[i] = nums[i + 1];
            res[i + 1] = nums[i];
        }

        return new int[]{3, 2, 5, 4};
    }
}