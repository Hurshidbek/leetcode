package org.example.leetcode.solution._2000_3000;

public class S_2661 {
    public static void main(String[] args) {
        System.out.println(2 == new S_2661()
                .firstCompleteIndex(new int[]{6, 2, 3, 1, 4, 5},
                        new int[][]{{5, 1}, {2, 4}, {6, 3}}
                ));
        System.out.println(1 == new S_2661()
                .firstCompleteIndex(new int[]{1, 4, 5, 2, 6, 3},
                        new int[][]{{4, 3, 5}, {1, 2, 6}}
                ));
        System.out.println(2 == new S_2661()
                .firstCompleteIndex(new int[]{1, 3, 4, 2},
                        new int[][]{{1, 4}, {2, 3}}
                ));
    }

    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int m = mat.length, n = mat[0].length, len = m * n;

        int[] map = new int[len + 1];

        for (int i = 0; i < len; i++)
            map[arr[i]] = i;

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < m; i++) {
            int max = 0;
            for (int j = 0; j < n; j++) {
                max = Math.max(max, map[mat[i][j]]);
            }
            min = Math.min(min, max);
        }

        for (int i = 0; i < n; i++) {
            int max = 0;
            for (int j = 0; j < m; j++) {
                max = Math.max(max, map[mat[j][i]]);
            }
            min = Math.min(min, max);
        }

        return min;
    }
}
