package org.example.leetcode.solution._2000_3000;

public class S_2109 {
    public static void main(String[] args) {
        var solution = new S_2109();

        System.out.println(solution.addSpaces("LeetcodeHelpsMeLearn", new int[]{8, 13, 15}));
    }

    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder();
        int ind = 0;
        for (int i = 0; i < s.length(); i++) {
            if (ind < spaces.length && i == spaces[ind]) {
                sb.append(' ');
                ind++;
            }
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}