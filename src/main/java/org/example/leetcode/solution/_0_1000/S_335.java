package org.example.leetcode.solution._0_1000;

public class S_335 {
    public static void main(String[] args) {
        S_335 solution = new S_335();


        System.out.println(solution.isSelfCrossing(new int[]{1, 1, 2, 2, 3, 3, 3, 2}));
        System.out.println(solution.isSelfCrossing(new int[]{1, 1, 2, 1, 1}));
        System.out.println(solution.isSelfCrossing(new int[]{2, 1, 1, 2}));
        System.out.println(solution.isSelfCrossing(new int[]{1, 1, 1, 2, 1}));
        System.out.println(solution.isSelfCrossing(new int[]{1, 1, 2, 2, 3, 3, 3, 1}));
        System.out.println(!solution.isSelfCrossing(new int[]{1, 1, 2}));
        System.out.println(!solution.isSelfCrossing(new int[]{1, 2, 3, 4}));
        System.out.println(!solution.isSelfCrossing(new int[]{1, 1, 2, 2, 3, 3, 4}));
    }

    int[] sign = new int[]{1, -1, -1, 1};

    public boolean isSelfCrossing(int[] distance) {
        for (int i = 3; i < distance.length; i++) {
            if (distance[i] >= distance[i - 2]
                    && distance[i - 1] <= distance[i - 3]) {
                return true;
            }
            if (i >= 4 && distance[i - 1] == distance[i - 3]
                    && distance[i] + distance[i - 4] >= distance[i - 2]) {
                return true;
            }
            if (i >= 5 && distance[i - 2] >= distance[i - 4]
                    && distance[i - 3] >= distance[i - 1]
                    && distance[i - 1] + distance[i - 5] >= distance[i - 3]
                    && distance[i] + distance[i - 4] >= distance[i - 2]) {
                return true;
            }
        }
        return false;
    }

}
