package org.example.leetcode.solution._3000_4000;

import java.util.PriorityQueue;

public class S_3066 {
    public static void main(String[] args) {
        var solution = new S_3066();

        System.out.println(solution.minOperations(new int[]{2, 11, 10, 1, 3}, 10));
        System.out.println(solution.minOperations(new int[]{999999999, 999999999, 999999999}, 1000000000));
    }

    public int minOperations2(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int num : nums) if (num < k) pq.add(num);
        int op = 0;

        while (!pq.isEmpty()) {
            int x = pq.poll();
            op++;
            if (pq.isEmpty()) break;
            int y = pq.poll();
            long up = 2l * x + y;
            if (up < k) pq.add((int) up);
        }
        return op;
    }

    public int minOperations(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i : nums) if (i < k) queue.add(i);
        int count = 0;
        while (!queue.isEmpty()) {
            int num1 = queue.poll();
            count++;

            if (queue.isEmpty()) break;
            int num2 = queue.poll();

            long temp = num1 * 2L + num2;
            if (temp < k) queue.add(num1 * 2 + num2);
        }
        return count;
    }
}