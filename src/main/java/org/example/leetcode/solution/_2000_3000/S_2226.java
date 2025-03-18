package org.example.leetcode.solution._2000_3000;

class S_2226 {
    public static void main(String[] args) {
        var solution = new S_2226();

        System.out.println(solution.maximumCandies(new int[]{5, 8, 6}, 3));
        System.out.println(solution.maximumCandies(new int[]{8, 6, 5}, 4));
        System.out.println(solution.maximumCandies(new int[]{7, 7, 5}, 4));
        System.out.println(solution.maximumCandies(new int[]{200, 5, 20}, 11));
    }

    public int maximumCandies(int[] candies, int k) {
        if (k == 0) return 0;

        int left = 1, right = getMax(candies);
        int result = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (canDistribute(candies, k, mid)) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }

    private boolean canDistribute(int[] candies, int k, int mid) {
        int count = 0;
        for (int candy : candies) {
            count += candy / mid;
        }
        return count >= k;
    }

    private int getMax(int[] candies) {
        int max = 0;
        for (int candy : candies) {
            max = Math.max(max, candy);
        }
        return max;
    }
}