package org.example.leetcode.solution._3000_4000;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

class S_3248 {
    public static void main(String[] args) {
        var solution = new S_3248();

        System.out.println(solution.finalPositionOfSnake(2, List.of("RIGHT","DOWN")));
    }

    Map<String, Integer> map = new HashMap<>(){{
        put("LEFT", -1);
        put("RIGHT", 1);
        put("DOWN", -1);
        put("UP", 1);
    }};
    public int finalPositionOfSnake(int n, List<String> commands) {
        int row = 0, col = 0;
        for(String s: commands){
            switch (s.charAt(0)){
                case 'L':col--;break;
                case 'R':col++;break;
                case 'U':row--;break;
                case 'D':row++;break;
            }
        }
        return row * n + col;
    }
}