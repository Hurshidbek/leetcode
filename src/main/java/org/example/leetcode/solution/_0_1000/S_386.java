package org.example.leetcode.solution._0_1000;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class S_386 {
    public static void main(String[] args) {
        S_386 solution = new S_386();

        System.out.println(solution.lexicalOrder(13));
    }

    public List<Integer> lexicalOrder(int n) {
        List<Integer> res = new ArrayList<>(n);
        int cur = 1;
        for (int i = 0; i < n; i++) {
            res.add(cur);
            if (cur * 10 <= n) {
                cur *= 10;
            } else {
                while (cur % 10 == 9 || cur + 1 > n) {
                    cur /= 10;
                }
                cur++;
            }
        }
        return res;
    }
}