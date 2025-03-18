package org.example.leetcode.solution._3000_4000;

class S_3280 {
    public static void main(String[] args) {
        var solution = new S_3280();

        System.out.println("100000100000-10-11101".equals(solution.convertDateToBinary("2080-02-29")));
    }

    public String convertDateToBinary(String date) {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toBinaryString(Integer.parseInt(date.substring(0,4))));
        sb.append("-");
        sb.append(Integer.toBinaryString(Integer.parseInt(date.substring(5,7))));
        sb.append("-");
        sb.append(Integer.toBinaryString(Integer.parseInt(date.substring(8,10))));
        return sb.toString();
    }
}