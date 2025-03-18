package org.example.leetcode.solution._2000_3000;

class S_2445 {
    public static void main(String[] args) {
        var solution = new S_2445();

        solution.averageValue(new int[]{1, 4, 3, 3, 2});
    }

    public int averageValue(int[] nums) {
        int count = 0, sum = 0;
        for (int i : nums) {
            if (i % 6 == 0){
                count++;
                sum += i;
            }
        }
        return count == 0 ? 0 : sum / count;
    }
}
