package org.example.leetcode.solution.learn;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(8));
    }


    public static int fibonacci(int i) {
        return i < 3 ? 1 : fibonacci(i-1) + fibonacci(i-2);
    }
}
