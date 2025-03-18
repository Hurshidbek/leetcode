package org.example.leetcode.solution._0_1000;

import java.util.Stack;

class S_394 {
    public static void main(String[] args) {
        var solution = new S_394();

        System.out.println(solution.decodeString("3[z]2[2[y]pq4[2[jk]e1[f]]]ef").equals("zzzyypqjkjkefjkjkefjkjkefjkjkefyypqjkjkefjkjkefjkjkefjkjkefef"));
        System.out.println(solution.decodeString("2[abc]3[cd]ef").equals("abcabccdcdcdef"));
        System.out.println(solution.decodeString("3[a]2[bc]").equals("aaabcbc"));
        System.out.println(solution.decodeString("3[a2[c]]").equals("accaccacc"));
        System.out.println(solution.decodeString("2[3[2[a]]2[bc]]"));
    }

    public String decodeString(String s) {
        s += " ";
        Stack<Integer> stack = new Stack<>();
        int len = s.length();
        StringBuilder res = new StringBuilder();
        StringBuilder sb = new StringBuilder();


        for (int i = 0; i < len; ) {
            char c = s.charAt(i);

            if (s.charAt(i) == ' ') {
                break;
            }

            if (s.charAt(i) == '[') {
                i++;
            }

            if (Character.isDigit(s.charAt(i))) {
                int count = 0;
                while (Character.isDigit(s.charAt(i))) {
                    c = s.charAt(i);
                    count = count * 10 + c - '0';
                    i++;
                }
                stack.add(count);
            }

            if (Character.isAlphabetic(s.charAt(i))) {
                sb = new StringBuilder();
                while (Character.isAlphabetic(s.charAt(i))) {
                    c = s.charAt(i);
                    sb.append(c);
                    i++;
                }
                res.append(sb);
            }

            if (s.charAt(i) == ']') {
                int count = stack.pop();
                while (count-- > 1) {
                    res.append(sb);
                }
                sb = new StringBuilder(res);
                i++;
            }

        }

        return res.toString();
    }


}