package org.example.leetcode.contest.weekly._492;

public class Q2 {
    public static void main(String[] args) {
        var solution = new Q2();

        System.out.println(solution.smallestBalancedIndex(new int[]{1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 359738368, 1, 536870913, 262144, 131072}));
        System.out.println(solution.smallestBalancedIndex(new int[]{813, 974, 946, 966, 915, 924, 812, 1000, 891, 875, 989, 656, 991, 806, 818, 999, 971, 276, 923, 997, 992, 943, 983, 811, 909, 990, 924, 991, 726, 818, 969, 690, 996, 784, 992, 949, 915, 931, 932, 821, 699, 688, 712, 805, 849, 489, 406, 482, 777, 974, 479, 237, 963, 903, 957, 995, 814, 864, 832, 889, 936, 467, 831, 970, 757, 646, 962, 987, 885, 924, 918, 710, 763, 839, 860, 888, 971, 994, 339, 253, 564, 759, 68, 747, 797, 716, 939, 987, 68, 953, 1000, 298, 10, 1, 1, 1, 1, 1, 48, 1, 77, 2}));
//        System.out.println(1 == solution.smallestBalancedIndex(new int[]{2, 1, 2}));
//        System.out.println(2 == solution.smallestBalancedIndex(new int[]{2, 8, 2, 2, 5}));
//        System.out.println(-1 == solution.smallestBalancedIndex(new int[]{1}));
    }

    long max = 100000000000000L;

    public int smallestBalancedIndex(int[] nums) {
        int len = nums.length;
        long[] left = new long[len];
        long[] right = new long[len];
        right[len - 1] = 1;

        for (int i = 1; i < len; i++) {
            left[i] = left[i - 1] + nums[i - 1];

            if (right[len - i] * nums[len - i] <= max) {
                right[len - i - 1] = right[len - i] * nums[len - i];
            } else {
                right[len - i - 1] = 100000000000001L;
            }
        }

        for (int i = 1; i < len; i++) {
            if (left[i] == right[i]) {
                return i;
            }
        }

        return -1;
    }


    public int smallestBalancedIndex1(int[] nums) {
        int len = nums.length;
        long[] left = new long[len];
        long[] right = new long[len];
        right[len - 1] = 1;

        for (int i = 1; i < len; i++) {
            left[i] = left[i - 1] + nums[i - 1];

            if (right[len - i] <= max / nums[len - i]) {
                right[len - i - 1] = right[len - i] * nums[len - i];
            } else {
                right[len - i - 1] = Long.MAX_VALUE;
            }
        }

        for (int i = 0; i < len; i++) {
            if (left[i] == right[i]) {
                return i;
            }
        }

        return -1;
    }
}
