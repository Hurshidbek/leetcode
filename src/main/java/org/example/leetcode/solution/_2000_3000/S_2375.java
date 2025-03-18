package org.example.leetcode.solution._2000_3000;

public class S_2375 {
    public static void main(String[] args) {
        S_2375 solution = new S_2375();

        System.out.println(solution.smallestNumber("IIIDIDDD"));
    }

    public String smallestNumber(String pattern) {
        StringBuilder sb = new StringBuilder();
        int pointer = 0, index = 0, len = pattern.length();

        for (int i = 0; i <= len; i++){
            pointer++;
            index++;
            if (i == len || pattern.charAt(i) == 'I'){
                int temp = pointer;
                while (index>0){
                    sb.append(temp--);
                    index--;
                }
            }
        }
        return sb.toString();
    }

    public String smallestNumber2(String pattern) {
        int n = pattern.length();
        StringBuilder result = new StringBuilder();
        int[] stack = new int[n + 1];
        int index = 0;

        for (int i = 0; i <= n; i++) {
            stack[index++] = i + 1;

            if (i == n || pattern.charAt(i) == 'I') {
                while (index > 0) {
                    result.append(stack[--index]);
                }
            }
        }

        return result.toString();
    }

}
