package org.example.leetcode.solution._0_1000;

import org.example.leetcode.solution.dictionaries.Utils;

import java.util.*;

public class S_885 {
    public static void main(String[] args) {

        var solution = new S_885();

        Utils.print(solution.spiralMatrixIII(1, 4, 0, 0));
        Utils.print(solution.spiralMatrixIII(2, 4, 0, 0));
        Utils.print(solution.spiralMatrixIII(5, 6, 1, 4));
    }

    int[][] dirs = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    int[][] dirLastPos = new int[4][2];

    // not finished
    public int[][] spiralMatrixIII(int rows, int cols, int row, int col) {

        int dir = 0;
        int index = 0;

        int[][] res = new int[rows * cols][2];
        res[0] = new int[]{row,col};

        while (index < rows * cols) {
            if (row < rows && col < cols && row > -1 && col > -1 && dirLastPos[dir][0] != row && dirLastPos[dir][1] != col) {
                dirLastPos[dir][0] = row;
                dirLastPos[dir][1] = col;
                index++;
                dir++;
                row += dirs[dir][0];
                col += dirs[dir][1];
            } else if (1==1) {

                
            }

            dir %= 4;
        }
        return res;
    }

    public int[][] spiralMatrixIII1(int rows, int cols, int row, int col) {
        int step = 1;
        int index = 0;
        int[][] res = new int[rows * cols][2];
        while (index < rows * cols) {
            for (int dir = 0; dir < 4; dir++) {
                for (int i = 0; i < step; i++) {
                    if (row >= 0 && row < rows && col >= 0 && col < cols) {
                        res[index++] = new int[]{row, col};
                        if (index == rows * cols) return res;
                    }
                    row += dirs[dir][0];
                    col += dirs[dir][1];
                }
                step += dir % 2;
            }
        }
        return res;
    }

}