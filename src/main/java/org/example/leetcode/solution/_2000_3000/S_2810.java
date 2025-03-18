package org.example.leetcode.solution._2000_3000;

public class S_2810 {
    public static void main(String[] args) {
        S_2810 solution = new S_2810();

        System.out.println(solution.finalString("string").equals("rtsng"));
        System.out.println(solution.finalString("poiinter").equals("ponter"));
    }

    public String finalString(String s) {
        StringBuilder sb = new StringBuilder();
        for(char c: s.toCharArray()){
            if (c=='i') sb.reverse();
            else sb.append(c);
        }
        return sb.toString();
    }

}
