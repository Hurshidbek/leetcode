package org.example.leetcode.solution._2000_3000;

public class S_2716 {
    public static void main(String[] args) {
        var solution = new S_2716();

        System.out.println(solution.minimizedStringLength("aaabc"));
    }

    public int minimizedStringLength(String s) {
        boolean[] freq = new boolean[26];
        var count = 0;
        for (var c : s.toCharArray()) {
            if (!freq[c-'a']){
                freq[c-'a'] = true;
                count++;
            }
        }
        return count;
    }
}