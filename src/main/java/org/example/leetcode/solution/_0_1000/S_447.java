package org.example.leetcode.solution._0_1000;

import java.util.HashMap;
import java.util.Map;

public class S_447 {
    public static void main(String[] args) {
        S_447 solution = new S_447();

        System.out.println(solution.numberOfBoomerangs(new int[][]{{0, 0}, {1, 0}, {4, 0}, {5, 0}}));
        System.out.println(solution.numberOfBoomerangs(new int[][]{{0, 0}, {2, 4}, {4, 2}, {-2, 4}}));
        System.out.println(solution.numberOfBoomerangs(new int[][]{{0, 0}, {1, 0}, {2, 0}}));
        System.out.println(solution.numberOfBoomerangs(new int[][]{{1, 1}, {2, 2}, {3, 3}}));
    }

    public int numberOfBoomerangs(int[][] points) {
        int res = 0;
        Map<Integer, Integer> diffs;
        for (int[] p1 : points) {
            diffs = new HashMap<>();
            for (int[] p2 : points) {
                int diff = (p1[0] - p2[0]) * (p1[0] - p2[0])
                        + (p1[1] - p2[1]) * (p1[1] - p2[1]);

                if (diffs.get(diff) != null) {
                    diffs.put(diff, diffs.get(diff) + 1);
                } else {
                    diffs.put(diff, 1);
                }
                res += diffs.get(diff) - 1;

//                res += diffs.merge(diff, 1, Integer::sum) - 1;
            }
        }
        return res * 2;
    }

    public int numberOfBoomerangs2(int[][] points) {
        double diff1 = 0, diff2 = 0, diff3 = 0;
        int count = 0;

        for (int i = 0; i < points.length - 2; i++) {
            for (int j = i + 1; j < points.length - 1; j++) {
                diff1 = Math.pow(points[i][0] - points[j][0], 2)
                        + Math.pow(points[i][1] - points[j][1], 2);
                for (int k = j + 1; k < points.length; k++) {
                    diff2 = Math.pow(points[i][0] - points[k][0], 2)
                            + Math.pow(points[i][1] - points[k][1], 2);
                    diff3 = Math.pow(points[j][0] - points[k][0], 2)
                            + Math.pow(points[j][1] - points[k][1], 2);

                    if (diff1 == diff2 || diff1 == diff3 || diff2 == diff3) {
                        count += 2;
                    }
                }
            }
        }

        return count;
    }
}
