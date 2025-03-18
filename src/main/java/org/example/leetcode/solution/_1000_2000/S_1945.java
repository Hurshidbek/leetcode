package org.example.leetcode.solution._1000_2000;

class S_1945 {
    public static void main(String[] args) {
        var solution = new S_1945();

        solution.getLucky("zbax", 2);
    }

    public int getLucky(String s, int k) {
        int a = convert(s);

        while (--k > 0) {
            a = digitSum(a);
        }
            return a;
    }

    private int convert(String s) {
        int a = 0;
        for (char c : s.toCharArray()) {
            a += digitSum(c - 'a' + 1);
        }
        return a;
    }

    private int digitSum(int num) {
        int digitSum = 0;
        while (num > 0){
            digitSum += num%10;
            num /= 10;
        }
        return digitSum;
    }


}
