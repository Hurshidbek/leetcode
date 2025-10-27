package org.example.leetcode.solution._2000_3000;

import java.util.Arrays;

public class S_2129 {
    public static void main(String[] args) {
        var solution = new S_2129();

        System.out.println(solution.capitalizeTitle("capiTalIze tHe titLe"));
    }

    //    97, 65
    public String capitalizeTitle(String title) {
        String[] split = title.toLowerCase().split(" ");
        StringBuilder sb = new StringBuilder();
        for (String s : split) {
            sb.append(" ");
            if (s.length() < 3) {
                sb.append(s);
            } else {
                sb.append((char) (s.charAt(0) - 32)).append(s.substring(1));
            }
        }
        return sb.substring(1);
    }
}