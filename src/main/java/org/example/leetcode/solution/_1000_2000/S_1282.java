package org.example.leetcode.solution._1000_2000;

import java.util.*;

public class S_1282 {
    public static void main(String[] args) {
        var solution = new S_1282();

        System.out.println(solution.groupThePeople(new int[]{3, 3, 3, 3, 3, 1, 3}));
    }

    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < groupSizes.length; i++) {
            map.putIfAbsent(groupSizes[i], new ArrayList<>());
            map.get(groupSizes[i]).add(i);
        }

        List<List<Integer>> res = new ArrayList<>();
        for(int key: map.keySet()){
            List<Integer> list = new ArrayList<>();
            for (int value: map.get(key)) {
                list.add(value);
                if (list.size() == key){
                    res.add(list);
                    list = new ArrayList<>();
                }
            }
        }

        return res;
    }
}