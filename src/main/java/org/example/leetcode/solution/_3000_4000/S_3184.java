package org.example.leetcode.solution._3000_4000;

public class S_3184 {
    public static void main(String[] args) {
        var solution = new S_3184();

        System.out.println(solution.countCompleteDayPairs(new int[]{12, 12, 30, 24, 24}));
    }

    public int countCompleteDayPairs(int[] hours) {
        int[] freq = new int[24];
        int count = 0;
        for (int hour : hours) {
            hour %= 24;
            count += freq[(24 - hour) % 24];
            freq[hour]++;
        }
        return count;
    }
}