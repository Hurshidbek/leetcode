package org.example.leetcode.solution._3000_4000;

import java.util.Arrays;

public class S_3683 {
    public static void main(String[] args) {
        var solution = new S_3683();

        System.out.println(solution.earliestTime(new int[][]{{1, 6}, {2, 3}}));
    }

    public int earliestTime(int[][] tasks) {
        int res = Integer.MAX_VALUE;
        for (int[] task: tasks) {
            if (res > task[0] + task[1]){
                res = task[0] + task[1];
            }
        }
        return res;
    }
}