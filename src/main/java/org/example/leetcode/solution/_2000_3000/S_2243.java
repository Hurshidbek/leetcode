package org.example.leetcode.solution._2000_3000;

public class S_2243 {
    public static void main(String[] args) {
        S_2243 solution = new S_2243();

        System.out.println(solution.digitSum("11111222223", 3));
    }

    public String digitSum(String s, int k) {
        while (s.length() > k) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length(); i += k) {
                int digitSum = 0;
                for (char c : s.substring(i, Math.min(i + k, s.length())).toCharArray()) {
                    digitSum += c - '0';
                }
                sb.append(digitSum);
            }
            s = sb.toString();
        }
        return s;
    }
}
