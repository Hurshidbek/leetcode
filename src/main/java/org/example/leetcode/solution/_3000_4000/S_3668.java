package org.example.leetcode.solution._3000_4000;

import java.util.Arrays;

public class S_3668 {
    public static void main(String[] args) {
        var solution = new S_3668();

        System.out.println(Arrays.toString(solution.recoverOrder(new int[]{3, 1, 2, 5, 4}, new int[]{1, 3, 4})));
    }

    public int[] recoverOrder(int[] order, int[] friends) {
        int[] res = new int[friends.length];
        int index = 0;

        for (int i = 0; i < order.length; i++) {
            for (int j = 0; j < friends.length; j++) {
                if (order[i] == friends[j]){
                    res[index++] = friends[j];
                    break;
                }
            }
        }

        return res;
    }
}