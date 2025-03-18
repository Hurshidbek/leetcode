package org.example.leetcode.solution.dictionaries;

import java.util.BitSet;

public class BitSetUtil {
    public static void main(String[] args) {
        System.out.println();
    }
    public static void add(BitSet bitSet, int val){
        bitSet.set(val);
    }
    public static boolean contains(BitSet bitSet, int target) {
        return bitSet.get(target);
    }
}