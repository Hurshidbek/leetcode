package org.example.leetcode.solution._0_1000;

class S_781 {
    public static void main(String[] args) {
        var solution = new S_781();

        System.out.println("11 == " + solution.numRabbits(new int[]{10, 10, 10}));
        System.out.println("5 == " + solution.numRabbits(new int[]{1, 0, 1, 0, 0}));
        System.out.println("16 == " + solution.numRabbits(new int[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3}));
        System.out.println("5 == " + solution.numRabbits(new int[]{1, 1, 2}));
    }

    public int numRabbits(int[] answers) {
        int[] nums = new int[1001];
        int count = 0;

        for (int i : answers) {
            if (nums[i]++ == 0) count += i + 1;
            if (nums[i] == i + 1) nums[i] = 0;
        }

        return count;
    }
}