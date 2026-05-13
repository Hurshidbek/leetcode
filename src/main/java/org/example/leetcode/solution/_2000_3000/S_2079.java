package org.example.leetcode.solution._2000_3000;

import java.util.Arrays;

public class S_2079 {
    public static void main(String[] args) {
        var solution = new S_2079();

        System.out.println(solution.wateringPlants(new int[]{2, 2, 3, 3}, 5));
    }

    public int wateringPlants(int[] plants, int capacity) {
        int res = 0, currCapacity = capacity;
        for (int i = 0; i < plants.length; i++) {
            if (currCapacity < plants[i]) {
                currCapacity = capacity;
                res += 2 * i;
            }
            currCapacity -= plants[i];
            res++;
        }
        return res;
    }
}