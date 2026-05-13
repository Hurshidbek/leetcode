
package org.example.leetcode.solution._2000_3000;

import jdk.jshell.execution.Util;
import org.example.leetcode.solution.dictionaries.Utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class S_2545 {
    public static void main(String[] args) {
        var solution = new S_2545();

        Utils.print(solution.sortTheStudents(new int[][]{{10, 6, 9, 1}, {7, 5, 11, 2}, {4, 8, 3, 15}}, 2));
    }

    public int[][] sortTheStudents(int[][] score, int k) {
        Arrays.sort(score, (a, b) -> b[k] - a[k]);
        return score;
    }
}