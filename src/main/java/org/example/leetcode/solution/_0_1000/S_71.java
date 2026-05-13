package org.example.leetcode.solution._0_1000;

import java.util.ArrayDeque;
import java.util.Deque;

public class S_71 {
    public static void main(String[] args) {
        var question = new S_71();

        System.out.println(question.simplifyPath("/../"));
//        System.out.println(question.simplifyPath("/home/"));
//        System.out.println(question.simplifyPath("/.../a/../b/c/../d/./"));
    }

    public String simplifyPath(String path) {

        Deque<String> stack = new ArrayDeque<>();
        String[] split = path.split("/");

        for (String part : split) {
            if (part.equals("") || part.equals(".")) {
                continue;
            } else if (part.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(part);
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append("/").append(stack.removeLast());
        }

        return sb.length() == 0 ? "/" : sb.toString();
    }

}