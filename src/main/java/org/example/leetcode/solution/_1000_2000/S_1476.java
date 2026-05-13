package org.example.leetcode.solution._1000_2000;

import org.example.leetcode.solution.dictionaries.Utils;

public class S_1476 {

    public static void main(String[] args) {
        var question = new SubrectangleQueries(new int[][]{{1, 2, 1}, {4, 3, 4}, {3, 2, 1}, {1, 1, 1}});
        Utils.print("null");
        Utils.print(question.getValue(0, 2));
        Utils.print("null");
        question.updateSubrectangle(0, 0, 3, 2, 5);
        Utils.print(question.getValue(0, 2));
        Utils.print(question.getValue(3, 1));
        Utils.print("null");
        question.updateSubrectangle(3, 0, 3, 2, 10);
        Utils.print(question.getValue(3, 1));
        Utils.print(question.getValue(0, 2));
    }

    static class SubrectangleQueries {
        int[][] rectangle;

        public SubrectangleQueries(int[][] rectangle) {
            this.rectangle = rectangle;
        }

        public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
            for (int i = row1; i <= row2; i++) {
                for (int j = col1; j <= col2; j++) {
                    rectangle[i][j] = newValue;
                }
            }
        }

        public int getValue(int row, int col) {
            return this.rectangle[row][col];
        }
    }

}