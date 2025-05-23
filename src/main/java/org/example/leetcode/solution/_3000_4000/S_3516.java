package org.example.leetcode.solution._3000_4000;

import org.example.leetcode.solution.dictionaries.TestCase;
import org.example.leetcode.solution.dictionaries.Utils;

import java.util.List;

public class S_3516 {
    public static void main(String[] args) {

        List<TestCase> testCases = List.of(
                new TestCase(1, 2, 7, 4),
                new TestCase(2, 2, 5, 6),
                new TestCase(0, 1, 5, 3)
        );

        Utils.executeMethod("findClosest", testCases);

    }

    public int findClosest(int x, int y, int z) {
        int diff = Math.abs(z - x) - Math.abs(z - y);
        return diff == 0 ? 0 : diff < 0 ? 1 : 2;
    }
}