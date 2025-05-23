
package org.example.leetcode.solution._3000_4000;

import org.example.leetcode.solution.dictionaries.TestCase;
import org.example.leetcode.solution.dictionaries.Utils;

import java.util.List;

public class S_3427 {
    public static void main(String[] args) {

        List<TestCase> testCases = List.of(
                new TestCase(11, new int[]{2, 3, 1})
        );

        Utils.executeMethod("subarraySum", testCases);

    }

    public int subarraySum(int[] nums) {

        int[] prefixSum = new int[nums.length + 1];

        for (int i = 1; i <= nums.length; i++) {
            prefixSum[i] = nums[i-1] + prefixSum[i-1];
        }

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += prefixSum[i+1] - prefixSum[Math.max(0, i - nums[i])];
        }

        return sum;
    }
}