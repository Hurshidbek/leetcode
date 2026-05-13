package org.example.leetcode.contest.weekly._492;

public class Q1 {
    public static void main(String[] args) {
        var solution = new Q1();

        System.out.println(solution.minimumIndex(new int[]{1, 5, 3, 7}, 3));
    }

    public int minimumIndex(int[] capacity, int itemSize) {
        int index = -1;
        for (int i = 0; i < capacity.length; i++) {
            if (capacity[i] < itemSize || (index >= 0 && capacity[index] <= capacity[i])) {
                continue;
            }
            index = i;
        }
        return index;
    }
}
