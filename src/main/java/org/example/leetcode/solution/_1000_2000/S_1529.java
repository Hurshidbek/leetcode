package org.example.leetcode.solution._1000_2000;


import java.util.Arrays;

class S_1529 {
    public static void main(String[] args) {
        var solution = new S_1529();

        System.out.println(solution.minFlips("10111"));
    }

    public int minFlips(String target) {
        char c = '0';
        int count = 0;
        for (int i = 0; i < target.length(); i++) {
            if (target.charAt(i) != c){
                count++;
                c = target.charAt(i);
            }
        }
        return count;
    }

}