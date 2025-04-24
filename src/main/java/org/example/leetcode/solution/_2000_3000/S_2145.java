package org.example.leetcode.solution._2000_3000;

class S_2145 {
    public static void main(String[] args) {
        var solution = new S_2145();

        System.out.println(solution.numberOfArrays(new int[]{-40}, -46, 53));
        System.out.println(solution.numberOfArrays(new int[]{4,-7,2}, 3, 6));
        System.out.println(solution.numberOfArrays(new int[]{3, -4, 5, 1, -2}, -4, 5));
    }

    public int numberOfArrays(int[] differences, int lower, int upper) {
        long prefixSum = 0, min = 0, max = 0;
        for (int i : differences) {
            prefixSum += i;
            if (prefixSum < min) min = prefixSum;
            if (prefixSum > max) max = prefixSum;
        }
        return (int) Math.max(upper - (lower + (max - min)) + 1, 0);
    }
}