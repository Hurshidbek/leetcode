package org.example.leetcode.solution._0_1000;

import org.example.leetcode.solution.dictionaries.Utils;

import java.util.BitSet;

public class S_137 {
    public static void main(String[] args) {
        var question = new S_137();

        Utils.print(question.singleNumber(new int[]{1, 2, 1, 3, 2, 5}));
    }

    public int singleNumber(int[] nums) {
        int ones = 0;
        int twos = 0;

        for (final int num : nums) {
            ones ^= (num & ~twos);
            twos ^= (num & ~ones);
        }

        return ones;
    }

}