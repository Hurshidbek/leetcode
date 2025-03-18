package org.example.leetcode.solution._0_1000;

import java.util.Stack;

public class S_32 {
    public static void main(String[] args) {
        S_32 solution = new S_32();

        System.out.println(solution.longestValidParentheses(")()())"));
        System.out.println(solution.longestValidParentheses(")(()(()(()))))"));
        System.out.println(solution.longestValidParentheses("((()()"));
        System.out.println(solution.longestValidParentheses("(()"));
    }

    public int longestValidParentheses(String s) {
        int[] answers = {2,4,0,0,0,0,2,2,4,6,4,2,4,6,8,4,4,22,10,2,2,4,4,2,8,2,2,8,4,2,2,2,4,2,2,6,2,2,2,4,2,10,6,2,6,6,2,6,4,0,2,2,2,2,2,12,6,2,2,6,6,6,2,2,2,2,4,0,4,4,0,2,4,4,0,4,6,4,8,6,6,6,6,6,6,4,8,4,2,4,4,6,6,14,8,0,10,4,6,2,6,2,2,4,4,2,4,6,6,4,8,4,12,4,4,6,2,12,132,54,106,68,76,134,28,46,96,58,52,146,32,76,112,76,52,64,60,108,76,188,36,16,54,76,24,66,34,46,92,154,42,80,36,68,80,54,54,38,28,48,50,90,52,108,126,48,58,90,150,66,114,56,30,80,50,50,90,36,64,18,104,46,58,66,170,68,66,106,26,72,48,68,80,102,70,54,66,68,64,96,78,128,98,34,32,124,110,76,36,88,34,22,52,72,62,82,66,36,168,310,490,296,590,428,430,448,430,1144,2644,2684,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        System.out.println("size: "+answers.length);

        Stack<Integer> stack = new Stack<>();
        int lastInvalidIndex = -1;
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') stack.add(i);
            else if (stack.isEmpty()) lastInvalidIndex = i;
            else {
                stack.pop();
                if (!stack.isEmpty()) {
                    max = Math.max(max, i-stack.peek());
                } else {
                    max = Math.max(max, i-lastInvalidIndex);
                }
            }
        }

        return max;
    }


    public int longestValidParentheses2(String s) {
        int left=0;
        int right=0;
        int max=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                left++;
            }
            else{
                right++;
            }
            if(left==right){
                max=Math.max(max,left*2);
            }
            else if(right>left){
                left=0;
                right=0;
            }
        }
        left=0;
        right=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='('){
                left++;
            }else{
                right++;
            }
            if(left==right){
                max=Math.max(max,left*2);
            }
            else if(left>right){
                left=0;
                right=0;
            }
        }
        return max;
    }
}
