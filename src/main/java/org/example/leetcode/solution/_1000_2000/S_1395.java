package org.example.leetcode.solution._1000_2000;

class S_1395 {
    public static void main(String[] args) {
        var solution = new S_1395();

        System.out.println(solution.numTeams(new int[]{2, 5, 3, 4, 1}));
    }

    public int numTeams(int[] rating) {
        int count = 0;
        for (int i = 0; i < rating.length - 2; i++) {
            for (int j = i + 1; j < rating.length - 1; j++) {
                for (int k = j + 1; k < rating.length; k++) {
                    if (rating[i] < rating[j] && rating[j] < rating[k]
                            || rating[i] > rating[j] && rating[j] > rating[k]) {
                        count++;
                    }
                }
            }
        }

        return count;
    }
}