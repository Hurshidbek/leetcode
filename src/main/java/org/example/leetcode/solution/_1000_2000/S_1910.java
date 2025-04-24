package org.example.leetcode.solution._1000_2000;

public class S_1910 {
    public static void main(String[] args) {
        var solution = new S_1910();

        solution.removeOccurrences("daabcbaabcbc", "abc");
    }

    public String removeOccurrences(String s, String part) {
        int ind = s.indexOf(part);
        while (ind >= 0) {
            s = s.substring(0, ind) + s.substring(ind + part.length());
            ind = s.indexOf(part);
        }
        return s;
    }
}