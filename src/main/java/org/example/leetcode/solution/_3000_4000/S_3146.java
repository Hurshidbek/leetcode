package org.example.leetcode.solution._3000_4000;

class S_3146 {
    public static void main(String[] args) {
        var solution = new S_3146();

        System.out.println(solution.findPermutationDifference("abc", "bac"));
    }

    public int findPermutationDifference(String s, String t) {
        int sum = 0;
        for (int i = 0; i < t.length(); i++) {
            sum += Math.abs(i-t.indexOf(s.charAt(i)));
        }
        return sum;
    }
}
