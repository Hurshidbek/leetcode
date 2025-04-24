package org.example.leetcode.solution._0_1000;

public class S_50 {
    public static void main(String[] args) {
        var solution = new S_50();

        long time = System.nanoTime();
        solution.myPow4(2, 10);
        System.out.println(System.nanoTime()-time);

        time = System.nanoTime();
        solution.myPow3(2, 10);
        System.out.println(System.nanoTime()-time);

        time = System.nanoTime();
        solution.myPow2(2, 10);
        System.out.println(System.nanoTime()-time);

        time = System.nanoTime();
        solution.myPow(2, 10);
        System.out.println(System.nanoTime()-time);
    }
    public double myPow4(double x, int n) {
        if (n == 0) return 1.0;

        double resp = 1.0;
        long tempn = n;

        if(tempn<0) tempn=-1*tempn;

        while(tempn>0){
            if(tempn%2==0){
                x*=x;
                tempn/=2;
            }else{
                resp=resp*x;
                tempn--;
            }
        }

        if(n<0) resp = (double)1.0/resp;

        return resp;
    }

    public double myPow3(double x, int n) {
        if (n == 0) return 1.0;

        long exp = n;
        if (exp < 0) {
            x = 1.0 / x;
            exp = -exp;
        }

        double result = 1.0;
        while (exp > 0) {
            if ((exp & 1) == 1) {
                result *= x;
            }
            x *= x;
            exp >>= 1;
        }

        return result;
    }

    public double myPow2(double x, int n) {
        return Math.pow(x, n);
    }

    public double myPow(double x, int n) {
        double t = 1;
        for (int i = 0; i < n; i++) {
            t *= x;
        }
        return t;
    }
}