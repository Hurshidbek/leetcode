package org.example.leetcode.solution._1000_2000;

import java.util.ArrayList;
import java.util.List;

class S_1352 {
    public static void main(String[] args) {
        ProductOfNumbers solution = null;
        String[] input = new String[]{"ProductOfNumbers", "add", "add", "add", "add", "add", "getProduct", "getProduct", "getProduct", "add", "getProduct"};
        int[] commands = new int[]{-1, 3, 0, 2, 5, 4, 2, 3, 4, 8, 2};

        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            if (input[i].equals("ProductOfNumbers")) {
                solution = new ProductOfNumbers();
                res.add(null);
            } else if (input[i].equals("add")) {
                solution.add(commands[i]);
                res.add(null);
            } else if (input[i].equals("getProduct")) {
                int product = solution.getProduct(commands[i]);
                res.add(product);
            }
        }
        System.out.println(res);
    }


    static class ProductOfNumbers {

        List<Integer> list;
        int prod = 1;

        public ProductOfNumbers() {
            list = new ArrayList<>();
        }

        public void add(int num) {
            if (num == 0) {
                prod = 1;
                list = new ArrayList<>();
                return;
            }
            prod *= num;
            list.add(prod);
        }

        public int getProduct(int k) {
            if (k > list.size()) return 0;
            if (k == list.size()) return list.get(list.size()-1);
            return list.get(list.size()-1) / list.get(list.size()-1 - k);
        }
    }

}


