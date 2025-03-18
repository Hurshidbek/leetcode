package org.example.leetcode.solution._0_1000;

import java.util.ArrayList;
import java.util.List;

public class S_22 {
    public static void main(String[] args) {
        S_22 solution = new S_22();

        System.out.println(solution.generateParenthesis(3));
    }
    public List<String> generateParenthesis(int n) {
        backtrack("", 0, 0, n);
        return result;
    }
    List<String> result = new ArrayList<>();
    private void backtrack(String current, int open, int close, int max) {
        if (current.length() == max * 2) {
            result.add(current);
            return;
        }

        StringBuilder sb = new StringBuilder();
        new ArrayList<>();

        if (open < max) {
            backtrack(current + "(", open + 1, close, max);
        }
        if (close < open) {
            backtrack(current + ")", open, close + 1, max);
        }
    }

}