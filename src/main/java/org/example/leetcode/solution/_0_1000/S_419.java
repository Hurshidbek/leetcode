package org.example.leetcode.solution._0_1000;

public class S_419 {
    public static void main(String[] args) {
        var question = new S_419();

        System.out.println(question.countBattleships(new char[][]{{'X', '.', '.', 'X'}, {'.', '.', '.', 'X'}, {'.', '.', '.', 'X'}}));
    }

    public int countBattleships(char[][] board) {
        int res = 0, row = board.length, col = board[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (board[i][j] != 'X') continue;
                if ((i > 0 && board[i - 1][j] == 'X') || (j > 0 && board[i][j - 1] == 'X')) continue;
                res++;
            }
        }
        return res;
    }
}