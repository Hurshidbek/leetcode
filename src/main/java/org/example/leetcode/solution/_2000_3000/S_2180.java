package org.example.leetcode.solution._2000_3000;

class S_2180 {
    public static void main(String[] args) {
        var solution = new S_2180();

        System.out.println(solution.countEven(10));
        System.out.println(solution.countEven(12));
        System.out.println(solution.countEven(4));
        System.out.println(solution.countEven(30));
    }

    public int countEven(int num) {
        int sum=0, temp = num;
        while(temp > 0){
            sum += (temp % 10);
            temp = temp / 10;
        }
        if(sum % 2 == 0) return num/2;
        else return (num-1)/2;
    }

}
