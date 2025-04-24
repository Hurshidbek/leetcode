package org.example.leetcode.solution._2000_3000;

class S_2999 {
    public static void main(String[] args) {
        var solution = new S_2999();

//        System.out.println(solution.numberOfPowerfulInt(1245, 3143, 4, "4")); // 45
        System.out.println(solution.numberOfPowerfulInt(15, 215, 6, "10"));
//        System.out.println(solution.numberOfPowerfulInt(1000, 2000, 4, "3000"));
//        System.out.println(solution.numberOfPowerfulInt(1, 6000, 4, "124"));
    }

    public long numberOfPowerfulInt(long start, long finish, int limit, String s) {
        long pow = (long) (Math.pow(10, s.length()));
        start = findFirst(start, Long.parseLong(s));
        int count = 0;

        while (start <= finish) {
            long j = (start % (pow * 10)) / pow;
            while (j++ <= limit && start <= finish) {
                count++;
                System.out.println(start);
                start += pow;
            }

            start = findNext(start, limit);
        }

        return count;
    }

    private long findFirst(long start, long temp) {
        long pow = (long) (Math.pow(10, (long) Math.log10(temp)+1));
        if (start % pow < temp) {
            return (start - start % pow) + temp;
        }
        int count = 0;
        while (start % pow > temp) {
            start /= pow;
            start++;
            count++;
        }
        long res = (long) (start * Math.pow(pow, count) + temp);
        return res;
    }

    private long findNext(long temp, int limit) {
        long temp2 = temp / 10;
        long temp3 = 0;
        long temp4 = 1;
        while (temp2 > 0) {
            if (temp2 % 10 >= limit) {
                temp3 += Math.pow(10, temp4) * (9 - limit);
            }
            temp4++;
            temp2 /= 10;
        }
        temp += temp3;

        return temp;
    }

//    start = 1244, finish = 3143, limit = 4, s = "4", res = 45

// 25 - 2004, 2014, 2024, 2034, 2044,
//      2104, 2114, 2124, 2134, 2144,
//      2204, 2214, 2224, 2234, 2244,
//      2304, 2314, 2324, 2334, 2344,
//      2404, 2414, 2424, 2434, 2444

// 5 -  3004, 3014, 3024, 3034, 3044
// 10 - 1304, 1314, 1324, 1334, 1344,
//      1404, 1414, 1424, 1434, 1444

// 4 -  3104 , 3114 , 3124 , 3134
// 1 -  1244

}