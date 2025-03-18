package org.example.leetcode.solution._3000_4000;

class S_3174 {
    public static void main(String[] args) {
        var solution = new S_3174();

        System.out.println(solution.clearDigits("abdcb34"));
    }

    public String clearDigits(String s) {
        StringBuilder sb = new StringBuilder();
        for(char c: s.toCharArray()){
            if (Character.isDigit(c)){
                sb.deleteCharAt(sb.length()-1);
            }
            else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}