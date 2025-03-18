package org.example.leetcode.solution._1000_2000;


class S_1415 {
    public static void main(String[] args) {
        var solution = new S_1415();

        System.out.println(solution.getHappyString(1, 3).equals("c"));
//        System.out.println(solution.getHappyString(3, 9).equals("cab"));
        System.out.println(solution.getHappyString(10, 100).equals("abacbabacb"));
        System.out.println(solution.getHappyString(1, 4).isEmpty());
    }

    public String getHappyString(int n, int k) {
        if (k-- > 3 * Math.pow(2, (n - 1))) return "";

        char[] cars = new char[]{'a', 'b', 'c'};
        StringBuilder sb = new StringBuilder();
        int prev = 11;

        while (k > 0 || n > 0) {
            int pow = (int) Math.pow(2, --n);
            int butun = (int) (k / pow);
            int qoldiq = (k % pow);

            if (prev <= butun) prev = butun + 1;
            else prev = butun;

            sb.append(cars[prev]);
            k = qoldiq;
        }

        return sb.toString();
    }

}