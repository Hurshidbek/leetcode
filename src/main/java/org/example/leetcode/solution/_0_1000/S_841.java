package org.example.leetcode.solution._0_1000;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class S_841 {
    public static void main(String[] args) {
        S_841 solution = new S_841();

        System.out.println(solution.canVisitAllRooms(List.of(
                List.of(1),
                List.of(2),
                List.of(3),
                List.of()
        )));
    }

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visited = new boolean[rooms.size()];
        visited[0] = true;

        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);

        int count = rooms.size() - 1;
        while (!queue.isEmpty()) {
            int room = queue.poll();
            for (int key : rooms.get(room)) {
                if (!visited[key]) {
                    visited[key] = true;
                    count--;
                    queue.add(key);
                }
            }
        }

        return count == 0;
    }
}