package org.example.leetcode.solution._0_1000;

import org.example.leetcode.solution.dictionaries.Utils;

import java.util.BitSet;

public class S_260 {
    public static void main(String[] args) {
        var question = new S_260();

        Utils.print(question.singleNumber(new int[]{1, 2, 1, 3, 2, 5}));
    }

    public int[] singleNumber(int[] nums) {
        BitSet bitSet = new BitSet();
        for (int i : nums) {
            if (bitSet.get(i - Integer.MIN_VALUE)) {
                bitSet.clear(i - Integer.MIN_VALUE);
            } else {
                bitSet.set(i - Integer.MIN_VALUE);
            }
        }
        return bitSet.stream().toArray();
    }

    public static void add(BitSet bitSet, int val) {
        bitSet.set(val);
    }

    public static boolean contains(BitSet bitSet, int target) {
        return bitSet.get(target);
    }
}