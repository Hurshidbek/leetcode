package org.example.leetcode.solution._1000_2000;

import java.util.*;

public class S_1079 {

    public static void main(String[] args) {
        String tiles = "112223";

        System.out.println("Kombinatsiyalar soni: " + numTilePossibilities(tiles));
    }

    public static long numTilePossibilities(String tiles) {
        Set<String> resultSet = new HashSet<>();

        for (int len = 1; len <= tiles.length(); len++) {
            generateCombinations(tiles, len, "", resultSet);
        }

        return resultSet.size();
    }

    private static void generateCombinations(String tiles, int len, String current, Set<String> resultSet) {
        if (current.length() == len) {
            resultSet.add(current);
            return;
        }

        for (int i = 0; i < tiles.length(); i++) {
            generateCombinations(tiles.substring(0, i) + tiles.substring(i + 1), len, current + tiles.charAt(i), resultSet);
        }
    }

}
