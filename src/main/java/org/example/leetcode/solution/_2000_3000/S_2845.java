package org.example.leetcode.solution._2000_3000;

import org.example.leetcode.solution.dictionaries.TestCase;
import org.example.leetcode.solution.dictionaries.Utils;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class S_2845 {
    public static void main(String[] args) {

        List<TestCase> testCases = List.of(
                new TestCase(2, Arrays.asList(3, 1, 9, 6), 3, 0),
                new TestCase(3, Arrays.asList(3, 2, 4), 2, 1)
        );

        Utils.executeMethod("countInterestingSubarrays", testCases);

    }

    public long countInterestingSubarrays(List<Integer> nums, int modulo, int k) {
        Map<Integer, Long> map = new HashMap<>();
        map.put(0, 1L);

        int prefix = 0;
        long res = 0;

        for (int num : nums) {
            if (num % modulo == k) {
                prefix = (prefix + 1) % modulo;
            } else {
                prefix = prefix % modulo;
            }

            int need = (prefix - k + modulo) % modulo;

            res += map.getOrDefault(need, 0L);

            map.put(prefix, map.getOrDefault(prefix, 0L) + 1);
        }

        return res;
    }
}