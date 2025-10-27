package org.example.leetcode.solution._2000_3000;

import java.util.Arrays;

public class S_2278 {
    public static void main(String[] args) {
        var solution = new S_2278();

        System.out.println(solution.percentageLetter("foobar", 'o'));
    }

    public int percentageLetter(String s, char letter) {
        int count = 0;
        for(char c: s.toCharArray()){
            if(c == letter){
                count++;
            }
        }
        return count  * 100 / s.length();
    }
}