package org.example.leetcode.solution._1000_2000;

import org.example.leetcode.solution.dictionaries.TestCase;
import org.example.leetcode.solution.dictionaries.Utils;

import java.util.List;

public class S_1295 {
    public static void main(String[] args) {

        List<TestCase> testCases = List.of(
                new TestCase(2, new int[]{12, 345, 2, 6, 7896})
        );

        Utils.executeMethod("findNumbers", testCases);

    }

    public int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if ((int) Math.log10(nums[i]) % 2 == 1) {
                count++;
            }
        }
        return count;
    }
}