package org.example.leetcode.solution._0_1000;

import java.util.Arrays;

public class S_824 {
    public static void main(String[] args) {
        var solution = new S_824();

        System.out.println(solution.toGoatLatin("I speak Goat Latin"));
    }

    public String toGoatLatin(String sentence) {
        String[] split = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for(String s: split){
            sb.append(" ");
            char c = s.charAt(0);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                    || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
                sb.append(s);
            }
            else {
                sb.append(s.substring(1)).append(c);
            }

            sb.append("ma");

            for (int i = 0; i < count; i++) {
                sb.append("a");
            }
            count++;
        }
        return sb.substring(1);
    }
}