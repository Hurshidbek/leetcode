package org.example.leetcode.solution._1000_2000;

import org.example.leetcode.solution.dictionaries.Utils;

public class S_1314 {
    public static void main(String[] args) {
        var question = new S_1314();

        Utils.print(question.matrixBlockSum(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, 1));
    }

    // 2D prefix sum
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int row = mat.length;
        int col = mat[0].length;
        int[][] res = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 1; j < col; j++) {
                mat[i][j] += mat[i][j - 1];
            }
        }

        for (int j = 0; j < col; j++) {
            for (int i = 1; i < row; i++) {
                mat[i][j] += mat[i - 1][j];
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                res[i][j] = getSum(mat, i, j, k);
            }
        }

        return res;
    }

    private int getSum(int[][] mat, int i, int j, int k) {
        int endRow = Math.min(mat.length - 1, i + k);
        int endCol = Math.min(mat[0].length - 1, j + k);
        int left = j - k - 1;
        int up = i - k - 1;

        int total = mat[endRow][endCol];
        int leftSum = (left >= 0) ? mat[endRow][left] : 0;
        int upSum = (up >= 0) ? mat[up][endCol] : 0;
        int leftUpDiagonal = (left >= 0 && up >= 0) ? mat[up][left] : 0;

        return total - leftSum - upSum + leftUpDiagonal;
    }
}