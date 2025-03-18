package org.example.leetcode.solution._2000_3000;

import java.math.BigInteger;

public class S_2125 {
    public static void main(String[] args) {
        S_2125 solution = new S_2125();

        System.out.println(solution.numberOfBeams(new String[]{"011001", "000000", "010100", "001000"}));
    }


    public int numberOfBeams(String[] bank) {
        int res = 0, prevCount = -1;

        for (String s : bank) {
            int count = 0;
            BigInteger n = new BigInteger(s, 2);
            while (n.compareTo(BigInteger.ZERO) > 0) {
                n = n.and(n.subtract(BigInteger.ONE)); // Clears the lowest set bit
                count++;
            }

//            for (char c : s.toCharArray()) {
//                count += c - '0';
//            }

            if (count > 0) {
                if (prevCount >= 0) {
                    res += prevCount * count;
                }
                prevCount = count;
            }

        }

        return res;
    }
}
