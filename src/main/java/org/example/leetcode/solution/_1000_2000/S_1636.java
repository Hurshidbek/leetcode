package org.example.leetcode.solution._1000_2000;

import org.example.leetcode.solution._0_1000.S_884;
import org.example.leetcode.solution.dictionaries.TestCase;
import org.example.leetcode.solution.dictionaries.Utils;

import java.util.Arrays;
import java.util.List;

public class S_1636 {
    public static void main(String[] args) {

        var solution = new S_1636();

        System.out.println(Arrays.toString(solution.frequencySort(new int[]{1, 1, 2, 2, 2, 3})));


    }

    public int[] frequencySort(int[] nums) {
        int[] arr = new int[101];

        for (int i : nums) {
            arr[i]++;
        }

        return nums;
    }
}