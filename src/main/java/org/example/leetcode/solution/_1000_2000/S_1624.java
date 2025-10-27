package org.example.leetcode.solution._1000_2000;

public class S_1624 {
    public static void main(String[] args) {
        var solution = new S_1624();

        System.out.println(0 == solution.maxLengthBetweenEqualCharacters("aa"));
        System.out.println(2 == solution.maxLengthBetweenEqualCharacters("abca"));
        System.out.println(-1 == solution.maxLengthBetweenEqualCharacters("cbzxy"));
    }

    public int maxLengthBetweenEqualCharacters(String s) {
        int res = -1;
        for (int i = 0; i < s.length(); i++) {
            res = Math.max(res, s.lastIndexOf(s.charAt(i)) - i - 1);
        }
        return res;
    }
}