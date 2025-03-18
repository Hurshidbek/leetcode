package org.example.leetcode.solution._1000_2000;

import java.util.Arrays;
import java.util.Stack;

class S_1944 {
    public static void main(String[] args) {
        var solution = new S_1944();

        System.out.println(Arrays.toString(solution.canSeePersonsCount(
                new int[]{10, 6, 8, 5, 11, 9})));
    }
    public int[] canSeePersonsCount(int[] heights) {
        int[] helper = new int[heights.length];
        int ind = 0;
        for (int i = heights.length - 1; i >= 0; i--) {
            int count = 0;
            while (ind > 0 && helper[ind-1] < heights[i]) {
                ind--;
                count++;
            }
            if (ind > 0) count++;
            helper[ind++] = heights[i];
            heights[i] = count;
        }
        return heights;
    }

    public int[] canSeePersonsCount2(int[] heights) {
        int[] helper = new int[heights.length];
        int ind = 0;
        for (int i = heights.length - 1; i >= 0; i--) {
            int count = 0;
            while (ind > 0 && helper[ind - 1] < heights[i]) {
                ind--;
                count++;
            }
            if (ind > 0) count++;

            helper[ind++] = heights[i];

            heights[i] = count;
        }
        return heights;
    }

    public int[] canSeePersonsCount1(int[] heights) {
        Stack<Integer> stack = new Stack<>();

        for (int i = heights.length - 1; i >= 0; i--) {
            int count = 0;

            while (!stack.isEmpty() && stack.peek() < heights[i]) {
                stack.pop();
                count++;
            }

            if (!stack.isEmpty() && stack.peek() >= heights[i]){
                count++;
            }

            stack.add(heights[i]);
            heights[i] = count;
        }

        return heights;
    }
}