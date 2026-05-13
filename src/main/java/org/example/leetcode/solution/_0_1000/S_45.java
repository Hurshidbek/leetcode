package org.example.leetcode.solution._0_1000;

import org.example.leetcode.solution.dictionaries.TestCase;
import org.example.leetcode.solution.dictionaries.Utils;

import java.util.List;

public class S_45 {
    public static void main(String[] args) {


        List<TestCase> testCases = List.of(
                new TestCase(2, new int[]{1, 2, 0, 1}),
                new TestCase(3, new int[]{1, 1, 1, 1}),
                new TestCase(1, new int[]{4, 3, 2, 1, 0}),
                new TestCase(3, new int[]{2, 6, 0, 1, 1, 1, 2, 0, 0}),
                new TestCase(0, new int[]{0}),
                new TestCase(2, new int[]{2, 3, 1, 1, 4}),
                new TestCase(2, new int[]{2, 3, 0, 1, 4})
        );

        Utils.executeMethod("jump", testCases);
    }

    public int jump(int[] nums) {
        int index = 0;
        int nextIndex = 0;
        int jump = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nextIndex < i + nums[i]) {
                nextIndex = i + nums[i];
            }
            if (i == index) {
                index = nextIndex;
                jump++;
            }
        }

        return jump;
    }

}