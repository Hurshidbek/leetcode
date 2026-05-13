package org.example.leetcode.solution._2000_3000;

import java.util.*;

public class S_2512 {
    public static void main(String[] args) {
        var solution = new S_2512();

//        System.out.println(solution.topStudents(new String[]{"smart", "brilliant", "studious"}, new String[]{"not"}, new String[]{"this student is studious", "the student is smart"}, new int[]{1, 2}, 2));
        System.out.println(solution.topStudents(new String[]{"smart", "brilliant", "studious"}, new String[]{"not"}, new String[]{"this student is not studious", "the student is smart"}, new int[]{1, 2}, 2));
    }

    public List<Integer> topStudents(String[] positive_feedback, String[] negative_feedback, String[] report, int[] student_id, int k) {
        Map<String, Integer> map = new HashMap(positive_feedback.length + negative_feedback.length);
        for (String pf : positive_feedback) {
            map.put(pf, 3);
        }
        for (String nf : negative_feedback) {
            map.put(nf, -1);
        }

        int[][] mark = new int[student_id.length][2];
        for (int i = 0; i < student_id.length; i++) {
            mark[i][1] = student_id[i];
            String[] split = report[i].split(" ");
            for (String s : split) {
                mark[i][0] += map.getOrDefault(s, 0);
            }
        }

        Arrays.sort(mark, (a, b) -> a[0] == b[0] ? a[1] - b[1] : b[0] - a[0]);

        List<Integer> res = new ArrayList<>(k);
        for (int i = 0; i < k; i++) {
            res.add(mark[i][1]);
        }

        return res;
    }

}
