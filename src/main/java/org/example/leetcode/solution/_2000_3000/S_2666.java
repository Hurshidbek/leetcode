package org.example.leetcode.solution._2000_3000;

class S_2666 {
    public static void main(String[] args) {
        var solution = new S_2666();
        System.out.println(solution.kItemsWithMaximumSum(6,6,6, 13));
        System.out.println(solution.kItemsWithMaximumSum(3,2,0, 2));
        System.out.println(solution.kItemsWithMaximumSum(3,2,0, 4));
    }


    public int kItemsWithMaximumSum(int num1, int num0, int numM1, int k) {
//        if (num1 >= k)
//            return k;
//        if (num1 + num0 >= k)
//            return num1;
//        return num1 - Math.min(k -= num1 + num0, numM1);

        return num1 >= k ? k : num1 + num0 >= k ? num1 : num1 - Math.min(k -= num1 + num0, numM1);
    }
}




