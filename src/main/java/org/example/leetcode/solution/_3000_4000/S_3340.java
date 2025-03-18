package org.example.leetcode.solution._3000_4000;

import java.util.stream.IntStream;

class S_3340 {
    public static void main(String[] args) {
        var solution = new S_3340();
        System.out.println(solution.isBalanced("24123"));
    }


    public boolean isBalanced(String num) {
//        return IntStream.range(0, num.length())
//                .map(i -> (i % 2 == 0 ? 1 : -1) * (num.charAt(i) - '0'))
//                .sum() == 0;

        int sum = 0;
        for (int i = 0; i < num.length(); i++) {
            sum += ((i % 2 == 0 ? 1 : -1)) * (num.charAt(i) - '0');
        }
        return sum == 0;
    }

}


