package org.example.leetcode.solution._2000_3000;

import org.example.leetcode.solution.dictionaries.TestCase;
import org.example.leetcode.solution.dictionaries.Utils;

import java.util.*;

public class S_2799 {
    public static void main(String[] args) {

        List<TestCase> testCases = List.of(
                new TestCase(4, (Object) new int[]{1, 3, 1, 2, 2}),
                new TestCase(10, (Object) new int[]{5, 5, 5, 5})
        );

        Utils.executeMethod("countCompleteSubarrays", testCases);

    }

    public int countCompleteSubarrays(int[] nums) {

        int[] numsCount = new int[2001];
        int typeCount = 0;
        for (int i : nums) {
            if (numsCount[i] == 0) typeCount++;
            numsCount[i]++;
        }

        Map<Integer, Integer> freq = new HashMap<>();
        int count = 0, pairCount = 0;
        int len = nums.length, left = 0;

        for (int right = 0; right < len; right++) {
            if (freq.merge(nums[right], 1, Integer::sum) == 1) {
                pairCount++;
            }
            while (pairCount >= typeCount) {
                count += len - right;
                if (freq.merge(nums[left++], -1, Integer::sum) == 0) {
                    pairCount--;
                }
            }
        }

        return count;
    }
}