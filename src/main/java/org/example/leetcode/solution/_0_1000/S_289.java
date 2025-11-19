package org.example.leetcode.solution._0_1000;

import java.util.Arrays;

public class S_289 {
    public static void main(String[] args) {
        try {
            var solution = new S_289();
            solution.gameOfLife(new int[][]{{0, 1, 0}, {0, 0, 1}, {1, 1, 1}, {0, 0, 0}});
        } catch (Throwable th) {
            System.out.println(th.getMessage());
            throw th;
        }
    }

    int[][] directions = new int[][]{{-1, -1}, {0, -1}, {1, -1}, {1, 0}, {1, 1}, {0, 1}, {-1, 1}, {-1, 0}};

    public void gameOfLife(int[][] board) {

        int xLen = board.length;
        int yLen = board[0].length;

        int[][] mat = new int[board.length][];
        for (int i = 0; i < board.length; i++) {
            mat[i] = Arrays.copyOf(board[i], board[i].length);
        }

        for (int x = 0; x < xLen; x++) {
            for (int y = 0; y < yLen; y++) {
                int count = 0;
                for (int d = 0; d < directions.length; d++) {
                    int X = x + directions[d][0];
                    int Y = y + directions[d][1];
                    if (X >= 0 && X < xLen && Y >= 0 && Y < yLen && mat[X][Y] == 1) {
                        count++;
                    }
                }
                if ((mat[x][y] == 1 && (count == 2 || count == 3)) || (mat[x][y] == 0 && count == 3)) {
                    board[x][y] = 1;
                } else {
                    board[x][y] = 0;
                }
            }
        }

        System.out.println(Arrays.deepToString(board));
    }
}
