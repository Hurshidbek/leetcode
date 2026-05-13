package org.example.leetcode.solution._0_1000;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class S_406 {
    public static void main(String[] args) {
        var question = new S_406();

        System.out.println(Arrays.deepToString(question.reconstructQueue(new int[][]{{7, 0}, {4, 4}, {7, 1}, {5, 0}, {6, 1}, {5, 2}})));
//        System.out.println(Arrays.deepToString(question.reconstructQueue(new int[][]{{6, 0}, {5, 0}, {4, 0}, {3, 2}, {2, 2}, {1, 4}})));
    }

    public int[][] reconstructQueue(int[][] people) {
        List<int[]> list = new LinkedList<>();
        for (int[] p : people) {
            list.add(p[1], p);
        }
        return list.toArray(new int[people.length][2]);
    }
}