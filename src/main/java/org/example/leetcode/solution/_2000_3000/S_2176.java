package org.example.leetcode.solution._2000_3000;

class S_2176 {
    public static void main(String[] args) {
        var solution = new S_2176();

        System.out.println(solution.countPairs(new int[]{3, 1, 2, 2, 2, 1, 3}, 2));
    }

    public int countPairs(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j] && i * j % k == 0) {
                    count++;
                }
            }
        }
        return count;
    }
}