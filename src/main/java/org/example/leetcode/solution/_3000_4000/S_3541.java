package org.example.leetcode.solution._3000_4000;

import org.example.leetcode.solution.dictionaries.TestCase;
import org.example.leetcode.solution.dictionaries.Utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class S_3541 {
    public static void main(String[] args) {

        List<TestCase> testCases = List.of(
                new TestCase(6, "successes")
        );

        Utils.executeMethod("maxFreqSum", testCases);

    }

    List<Character> chars = List.of('a', 'e', 'i', 'o', 'u');

    public int maxFreqSum(String s) {
        int maxVowel = 0, maxConsonant = 0;
        Map<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            int count = map.merge(c, 1, Integer::sum);
            if (chars.contains(c)) {
                if (count > maxVowel) {
                    maxVowel = count;
                }
            } else {
                if (count > maxConsonant) {
                    maxConsonant = count;
                }
            }
        }

        return maxVowel + maxConsonant;
    }
}