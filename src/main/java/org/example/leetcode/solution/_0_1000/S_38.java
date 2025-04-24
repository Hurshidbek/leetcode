package org.example.leetcode.solution._0_1000;

class S_38 {
    public static void main(String[] args) {
        var solution = new S_38();

        System.out.println(solution.countAndSay(4));
    }

    public String countAndSay(int n) {
        StringBuilder res = new StringBuilder("1");

        for (int j = 2; j <= n; j++) {
            String prev = res.toString();
            res = new StringBuilder();
            int i = 0;
            while (i < prev.length()) {
                int count = 1;
                while (i < prev.length() - 1 && prev.charAt(i) == prev.charAt(i + 1)) {
                    count++;
                    i++;
                }
                res.append(count).append(prev.charAt(i));
                i++;
            }
        }

        return res.toString();
    }

    public String countAndSay1(int n) {
        StringBuilder res = new StringBuilder("1");
        for (int i = 2; i <= n; i++) {
            StringBuilder temp = res;
            res = new StringBuilder();
            int ind = 0;
            while(ind < temp.length()){
                char c = temp.charAt(ind);
                int count = 1;
                while (ind < temp.length() && temp.charAt(ind) == c){
                    count++;
                    ind++;
                }
                res.append(count);
                res.append(c);
            }
        }

        return res.toString();
    }
}