package org.example.leetcode.solution.interview;

public class Main {

    public static void main(String[] args) {
        // String — Bootstrap yuklagan
        System.out.println(String.class.getClassLoader());
        // null (Bootstrap native, Java da ko'rinmaydi)

        // Sizning class — Application yuklagan
        System.out.println(Main.class.getClassLoader());
        // sun.misc.Launcher$AppClassLoader@...

        // Delegation ni ko'rish
        ClassLoader cl = Main.class.getClassLoader();
        System.out.println(cl.getParent());
        // sun.misc.Launcher$ExtClassLoader@...

        System.out.println(cl.getParent().getParent());
        // null (Bootstrap)
    }

}
