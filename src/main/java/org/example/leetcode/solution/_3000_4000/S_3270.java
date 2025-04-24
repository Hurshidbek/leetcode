package org.example.leetcode.solution._3000_4000;

public class S_3270 {
    public static void main(String[] args) {
        var solution = new S_3270();

        solution.generateKey2(987, 879, 798);
        solution.generateKey(282, 718, 1028);
    }

    public int generateKey(int num1, int num2, int num3) {
        int sum =0;
        int i=0;
        int c=1;

        while(i<4){
            int val=Math.min(num1%10,Math.min(num2%10,num3%10));
            num1=num1/10;
            num2=num2/10;
            num3=num3/10;
            sum=sum+val*c;
            c=c*10;
            i=i+1;
        }
        return sum;
    }
    public int generateKey2(int num1, int num2, int num3) {
        int res = 0, pow = 1;
        while (num1 > 0 || num2 > 0 || num3 > 0) {
            res = res + (pow*=10)/10 * Math.min(num1 % 10, Math.min(num2 % 10, num3 % 10));
            num1/=10;num2/=10;num3/=10;
        }
        return res;
    }

    private int helper(int num) {
        return num == 0 ? 10 : num % 10;
    }
}