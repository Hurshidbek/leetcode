package org.example.leetcode.solution._2000_3000;

public class S_2409 {
    public static void main(String[] args) {
        var solution = new S_2409();
        solution.countDaysTogether("10-01", "10-31", "11-01", "12-31");
        solution.countDaysTogether("02-28", "03-01", "02-01", "03-01");
    }

    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int maxArrive = Math.max(Days(arriveAlice), Days(arriveBob));
        int minLeave = Math.min(Days(leaveAlice), Days(leaveBob));

        return maxArrive > minLeave ? 0 : Math.abs(maxArrive - minLeave)+1;
    }

    int[] month = {31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334, 365};

    private int Days(String str) {
        int m = Integer.parseInt(str.substring(0, 2));
        int d = Integer.parseInt(str.substring(3));
        return m == 1 ? d : d + month[m - 2];
    }

}