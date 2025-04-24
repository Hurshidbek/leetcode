package org.example.leetcode.solution._2000_3000;

public class S_2946 {
    public static void main(String[] args) {
        var solution = new S_2946();

        System.out.println(!solution.areSimilar(new int[][]{{1,1,1},{4,5,6},{7,8,9}}, 4));
    }

    public boolean areSimilar(int[][] mat, int k) {
        int m = mat.length, n = mat[0].length;
        int[][] temp = new int[m][n];
        int[] sign = new int[]{1, -1};

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                temp[i][j] = mat[i][(j + ((k * sign[i % 2]) % n) + n) % n];
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (temp[i][j] != mat[i][j]){
                    return false;
                }
            }
        }

        return true;
    }
}




