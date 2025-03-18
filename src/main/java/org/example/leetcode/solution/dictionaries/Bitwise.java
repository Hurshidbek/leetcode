package org.example.leetcode.solution.dictionaries;

public class Bitwise {
    public static void main(String[] args) {
        System.out.println();
    }
    public static long add(long bitmask, int num){
        return bitmask | (1L << num);
    }
    public static boolean contains(long bitmask, int num) {
        return (bitmask & (1L << num)) != 0;
    }
}