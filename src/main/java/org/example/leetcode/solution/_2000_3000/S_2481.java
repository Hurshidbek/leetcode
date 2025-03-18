package org.example.leetcode.solution._2000_3000;

class S_2481 {
    public static void main(String[] args) {
        var solution = new S_2481();

        System.out.println(solution.numberOfCuts(14));
    }

    public int numberOfCuts(int n) {
        return n == 1 ? 1 : 180 % (360/n) == 0 ? n/2 : n;
    }
}