package org.example.leetcode.solution._3000_4000;

import org.example.leetcode.solution.dictionaries.TestCase;
import org.example.leetcode.solution.dictionaries.Utils;

import java.util.List;

public class S_3498 {
    public static void main(String[] args) {

        List<TestCase> testCases = List.of(
                new TestCase(148, "abc"),
                new TestCase(160, "zaza")
        );

        Utils.executeMethod("reverseDegree", testCases);

    }

    public int reverseDegree(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            res += (26 - s.charAt(i) + 'a') * (i + 1);
        }
        return res;
    }
}