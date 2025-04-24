package org.example.leetcode.solution._3000_4000;

public class S_3014 {
    public static void main(String[] args) {
        var solution = new S_3014();
        System.out.println(solution.minimumPushes("abcde"));
        System.out.println(solution.minimumPushes("xycdefghij"));
    }


    public int minimumPushes(String word) {
        return 8 * (word.length() / 8) * (word.length() / 8 + 1) / 2 + (word.length() / 8 + 1) * (word.length() % 8);
    }

}


