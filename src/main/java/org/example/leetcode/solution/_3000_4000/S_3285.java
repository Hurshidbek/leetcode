package org.example.leetcode.solution._3000_4000;

import org.example.leetcode.solution.dictionaries.TestCase;
import org.example.leetcode.solution.dictionaries.Utils;

import java.util.ArrayList;
import java.util.List;

public class S_3285 {
    public static void main(String[] args) {

        List<TestCase> testCases = List.of(
                new TestCase(List.of(3, 4), new int[]{1, 2, 3, 4, 5}, 2)
        );

        Utils.executeMethod("stableMountains", testCases);

    }

    public List<Integer> stableMountains(int[] height, int threshold) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < height.length - 1; i++) {
            if (height[i] > threshold) {
                list.add(i+1);
            }
        }
        return list;
    }
}