package org.example.leetcode.solution._2000_3000;

class S_2799 {
    public static void main(String[] args) {
        var solution = new S_2799();

        var s1 = 4;
        int res1 = solution.countCompleteSubarrays(new int[]{1, 3, 1, 2, 2});
        System.out.println((s1 == res1) ? true : false + " - " + res1);

        System.out.println(solution.countCompleteSubarrays(new int[]{5, 5, 5, 5}));
    }

    public int countCompleteSubarrays(int[] nums) {
        return 0;
    }
}