package org.example.leetcode.solution._2000_3000;

public class S_2582 {
    public static void main(String[] args) {
        var solution = new S_2582();

        System.out.println(solution.passThePillow(4, 5));
    }

    public int passThePillow(int n, int time) {
        return (time / --n) % 2 == 0 ? 1 + (time % n) : (n + 1) - (time % n);
    }
}




