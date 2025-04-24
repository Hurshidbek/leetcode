package org.example.leetcode.solution._3000_4000;

class S_3375 {
    public static void main(String[] args) {
        var solution = new S_3375();

        System.out.println(solution.minOperations(new int[]{5, 2, 5, 4, 5}, 2));
    }

    public int minOperations(int[] nums, int k) {
        int[] isExist = new int[101];
        int count = 0;
        for (int i : nums) {
            if (i < k) return -1;
            if (isExist[i]++ == 0 && i != k) count++;
        }
        return count;
    }
}