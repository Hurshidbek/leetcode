package org.example.leetcode.solution._3000_4000;

class S_3370 {
    public static void main(String[] args) {
        var solution = new S_3370();

        System.out.println(solution.smallestNumber(5));
    }

    public int smallestNumber(int n) {
        return (int) (Math.pow(2, (int) (Math.log(n) / Math.log(2))+1)-1);
    }
}