package org.example.leetcode.solution._1000_2000;

import org.example.leetcode.solution.dictionaries.Utils;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class S_1817 {
    public static void main(String[] args) {
        var solution = new S_1817();

        Utils.print(solution.findingUsersActiveMinutes(new int[][]{{0, 5}, {1, 2}, {0, 2}, {0, 5}, {1, 3}}, 5));
    }

    public int[] findingUsersActiveMinutes(int[][] logs, int k) {

        Map<Integer, Set<Integer>> map = new HashMap<>();

        for (int[] log : logs) {
            map.computeIfAbsent(log[0], x -> new HashSet<>()).add(log[1]);
        }

        int[] answer = new int[k];

        for (Set<Integer> minutes : map.values()) {
            int uam = minutes.size();
            if (uam <= k) {
                answer[uam - 1]++;
            }
        }

        return answer;
    }
}