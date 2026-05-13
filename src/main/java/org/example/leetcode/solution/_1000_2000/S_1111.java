package org.example.leetcode.solution._1000_2000;

import java.util.Arrays;

public class S_1111 {
    public static void main(String[] args) {
        var question = new S_1111();

        System.out.println(Arrays.toString(question.maxDepthAfterSplit("((()))")));
//        System.out.println(Arrays.toString(question.maxDepthAfterSplit("(()())")));
    }

    public int[] maxDepthAfterSplit(String seq) {
        int[] res = new int[seq.length()];
        int depth = 0;
        for (int i = 0; i < seq.length(); i++) {
            if (seq.charAt(i) == '(') {
                res[i] = depth % 2;
                depth++;
            } else {
                depth--;
                res[i] = depth % 2;
            }
        }
        return res;
    }
}