package org.example.leetcode.solution._0_1000;

import java.util.Stack;

public class S_946 {
    public static void main(String[] args) {
        var solution = new S_946();

//        System.out.println(solution.validateStackSequences(new int[]{1, 2, 3, 4, 5}, new int[]{4, 5, 3, 2, 1}));
//        System.out.println(solution.validateStackSequences(new int[]{1, 2, 3, 4, 5}, new int[]{4, 3, 5, 1, 2}));
        System.out.println(solution.validateStackSequences(new int[]{1, 0}, new int[]{1, 0}));

    }

    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int i = 0, j = 0;
        for (int val : pushed) {
            pushed[i++] = val;
            while (i > 0 && pushed[i - 1] == popped[j]) {
                i--;
                j++;
            }
        }
        return i == 0;
    }

    public boolean validateStackSequences1(int[] pushed, int[] popped) {
        int index = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < popped.length; i++) {
            stack.push(pushed[i]);
            while (index < popped.length && stack.size() != 0 && popped[index] == stack.peek()) {
                stack.pop();
                index++;
            }
        }

        return stack.size() == 0;
    }

}