package org.example.leetcode.solution._0_1000;

import java.util.Arrays;

public class S_224 {
    public static void main(String[] args) {
        var solution = new S_224();

        System.out.println(solution.calculate("1 + 1"));
        System.out.println(solution.calculate(" 2-1 + 2 "));
        System.out.println(solution.calculate("(1+(4+5+2)-3)+(6+8)"));
    }

    public int calculate(String s) {
        s = s.replace(" ", "");

        int dfs = dfs(s, 0);

        return 0;
    }

    public int dfs(String s, int ind) {

        int num = 0;
        int temp = 0;

        for (int i = ind; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                temp = dfs(s, ind + 1);
            } else if (s.charAt(i) == ')') {
                return num;
            } else if (Character.isDigit(s.charAt(i))) {
                temp = temp * 10 + s.charAt(i) - '0';
            } else {

            }
        }

        return num;
    }
}