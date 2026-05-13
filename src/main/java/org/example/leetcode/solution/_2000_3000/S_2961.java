package org.example.leetcode.solution._2000_3000;

import java.util.ArrayList;
import java.util.List;

class S_2961 {
    public static void main(String[] args) {
        var solution = new S_2961();

        System.out.println(solution.getGoodIndices(new int[][]{{2, 3, 3, 10}, {3, 3, 3, 1}, {6, 1, 1, 4}}, 2));
    }

    List<List<Integer>> powLastNum = List.of(
            List.of(0, 0, 0, 0),
            List.of(1, 1, 1, 1),
            List.of(2, 4, 8, 6),
            List.of(3, 9, 7, 1),
            List.of(4, 6, 4, 6),
            List.of(5, 5, 5, 5),
            List.of(6, 6, 6, 6),
            List.of(7, 9, 3, 1),
            List.of(8, 4, 2, 6),
            List.of(9, 1, 9, 1)
    );

//    ((ai^bi % 10)^ci) % mi == target

    public List<Integer> getGoodIndices(int[][] variables, int target) {
        List<Integer> res = new ArrayList<>();
        int ind = 0;
        for (int[] var : variables) {
//            var[0] %= var[2];
            var[0] = powLastNum.get(var[0] % 10).get(--var[1] % 4) % var[3];
            int num = var[0];
            for (int i = 1; i < var[2]; i++) {
                num = (num * var[0]) % var[3];
            }
            if (num == target) {
                res.add(ind);
            }
            ind++;
        }
        return res;
    }

}