package org.example.leetcode.solution._0_1000;

public class S_944 {
    public static void main(String[] args) {
        var solution = new S_944();

        System.out.println(solution.minDeletionSize(new String[]{"zyx", "wvu", "tsr"}));
//        System.out.println(solution.minDeletionSize(new String[]{"cba", "daf", "ghi"}));
    }

    public int minDeletionSize(String[] strs) {
        if (strs.length == 1) return 0;
        int count = 0;
        for (int i = 0; i < strs[0].length(); i++) {
            for (int j = 0; j < strs.length - 1; j++) {
                if (strs[j].charAt(i) > strs[j + 1].charAt(i)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

}