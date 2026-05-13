package org.example.leetcode.solution._0_1000;

import org.example.leetcode.solution.dictionaries.Utils;

import java.util.*;

public class S_587 {
    public static void main(String[] args) {
        S_587 solution = new S_587();

//        Utils.print(solution.outerTrees(new int[][]{{0,1}, {1, 0}, {2, 0}, {3, 1}}));
        Utils.print(solution.outerTrees(new int[][]{{0, 0}, {0, 1}, {1, 0}, {1, 1}}));
        Utils.print(solution.outerTrees(new int[][]{{1, 1}, {2, 2}, {2, 0}, {2, 4}, {3, 3}, {4, 2}}));
    }

    public int[][] outerTrees(int[][] trees) {
        if (trees.length <= 3) return trees;

        Arrays.sort(trees, (a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);

        Set<String> seen = new HashSet<>();
        List<int[]> hull = new ArrayList<>();

        for (int[] p : trees) {
            while (hull.size() >= 2 && cross(hull.get(hull.size() - 2), hull.get(hull.size() - 1), p) < 0) {
                hull.remove(hull.size() - 1);
            }
            hull.add(p);
        }

        int lowerSize = hull.size();
        for (int i = trees.length - 2; i >= 0; i--) {
            while (hull.size() > lowerSize && cross(hull.get(hull.size() - 2), hull.get(hull.size() - 1), trees[i]) < 0) {
                hull.remove(hull.size() - 1);
            }
            hull.add(trees[i]);
        }

        hull.remove(hull.size() - 1);

        return hull.toArray(new int[hull.size()][]);
    }

    private int cross(int[] p2, int[] p1, int[] p) {
        return (p1[0] - p2[0]) * (p[1] - p2[1]) - (p1[1] - p2[1]) * (p[0] - p2[0]);
    }
}