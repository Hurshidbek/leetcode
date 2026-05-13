package org.example.leetcode.solution._0_1000;

import org.example.leetcode.solution.dictionaries.Utils;

import java.util.ArrayList;
import java.util.List;

public class S_59 {
    public static void main(String[] args) {
        S_59 solution = new S_59();

        Utils.print(solution.generateMatrix(3));
        Utils.print(solution.generateMatrix(4));
        Utils.print(solution.generateMatrix(5));
        Utils.print(solution.generateMatrix(6));
    }

    int[][] dir = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

    public int[][] generateMatrix(int n) {

        int[][] res = new int[n][n];
        int countDir = 0, num = 1;
        int x = 0, y = -1;

        while (n > 0) {
            for (int i = 1; i <= n; i++) {
                x += dir[countDir % 4][0];
                y += dir[countDir % 4][1];
                res[x][y] = num++;
            }
            if (countDir++ % 2 == 0){
                n--;
            }
        }

        return res;
    }
}