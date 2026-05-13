package org.example.leetcode.quest.maths.l3;

import org.example.leetcode.solution.dictionaries.Utils;

import java.util.ArrayList;
import java.util.List;

public class Q2 {
    public static void main(String[] args) {
        Q2 solution = new Q2();

        Utils.printDoubleList(solution.generate(5));
    }


    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            int num = 1;
            for (int j = 0; j <= i; j++) {
                row.add(num);
                num = num * (i - j) / (j + 1);
            }
            res.add(row);
        }
        return res;
    }

    public List<List<Integer>> generate1(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    row.add(res.get(i - 1).get(j - 1) + res.get(i - 1).get(j));
                }
            }
            res.add(row);
        }
        return res;
    }

}