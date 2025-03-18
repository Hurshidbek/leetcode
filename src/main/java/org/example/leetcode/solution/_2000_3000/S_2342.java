package org.example.leetcode.solution._2000_3000;

import java.util.HashMap;
import java.util.Map;

class S_2342 {
    public static void main(String[] args) {
        var solution = new S_2342();

        System.out.println(solution.maximumSum(new int[]{10,12,19,14}));
        System.out.println(solution.maximumSum(new int[]{809039901, 892618095, 699694397, 576724044, 699515542, 831899037, 959450091, 88124465, 102780641, 275884357, 658771111, 660539885, 620862925, 263622781, 778473545, 672947452, 521367711, 970040373, 895455228, 886907524, 781592735, 528179525, 100136578, 646624289, 523918444, 628999419, 931048268, 991029445, 631668102, 667259810, 535380751, 786735115, 971553625, 797004919, 81520773, 137283330, 846189211, 464238688, 713970439, 286355524, 482704479, 527261737, 383453409, 217307241, 601715229, 828501551, 256079369, 567779582, 770290899, 264325638, 778183437, 411538949, 798508462, 831231181, 56846075, 112379513, 259195786, 67218178, 957517878, 911879358, 119232266, 891855628, 438001321, 732866407, 521986754, 5058581, 912946383, 243362613, 899499777, 226815070, 285361727, 44274463}));
        System.out.println(solution.maximumSum(new int[]{9, 18, 36, 27, 45}));
        System.out.println(solution.maximumSum(new int[]{18, 43, 36, 13, 7}));
        System.out.println(solution.maximumSum(new int[]{279, 169, 463, 252, 94, 455, 423, 315, 288, 64, 494, 337, 409, 283, 283, 477, 248, 8, 89, 166, 188, 186, 128}));
    }

    public int maximumSum(int[] nums) {
        int[] digitSums = new int[82];
        int maxSum = -1;
        for (int num : nums) {
            int digitSum = 0;
            long temp = num * 10L;
            while (temp != 0) {
                digitSum += (temp /= 10) % 10;
            }
            if(digitSums[digitSum] != 0) maxSum = Math.max(maxSum, num + digitSums[digitSum]);
            digitSums[digitSum] = Math.max(digitSums[digitSum], num);
        }
        return maxSum;
    }

    public int maximumSum2(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = -1;

        for (int num : nums) {
            int digitSum = 0, temp = num;
            while (temp > 0) {
                digitSum += temp % 10;
                temp /= 10;
            }

            Integer old = map.get(digitSum);

            if (old == null) {
                map.put(digitSum, num);
                continue;
            }
            if (old < num) {
                map.put(digitSum, num);
            }
            if (old + num > max) {
                max = old + num;
            }

//            map.merge(digitSum, num, (a, b) -> a < b ? b : a);
        }

        return max;
    }
}