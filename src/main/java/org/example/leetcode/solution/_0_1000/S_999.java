package org.example.leetcode.solution._0_1000;

public class S_999 {
    public static void main(String[] args) {
        var solution = new S_999();

        System.out.println(solution.numRookCaptures(new char[][]{
                {'.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', 'p', '.', '.', '.', '.'},
                {'.', '.', '.', 'R', '.', '.', '.', 'p'},
                {'.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', 'p', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.'}
        }));
    }

    public int numRookCaptures(char[][] board) {
        int res = 0;
        int a = 0, b = 0;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'R') {
                    a = i;
                    b = j;
                }
            }
        }

        for (int i = a + 1; i < board.length; i++) {
            char c = board[i][b];
            if (c != '.') {
                if (c == 'p')
                    res++;
                break;
            }
        }

        for (int i = a - 1; i >= 0; i--) {
            char c = board[i][b];
            if (c != '.') {
                if (c == 'p')
                    res++;
                break;
            }
        }

        for (int i = b + 1; i < board.length; i++) {
            char c = board[a][i];
            if (c != '.') {
                if (c == 'p')
                    res++;
                break;
            }
        }

        for (int i = b - 1; i >= 0; i--) {
            char c = board[a][i];
            if (c != '.') {
                if (c == 'p')
                    res++;
                break;
            }
        }

        return res;
    }
}