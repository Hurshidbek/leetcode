package org.example.leetcode.solution._3000_4000;

class S_3271 {
    public static void main(String[] args) {
        var solution = new S_3271();
        System.out.println(solution.stringHash("abcd", 2).equals("bf"));
    }


    public String stringHash(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i += k) {
            int sum = 0;
            for (int j = 0; j < k; j++) {
                sum += s.charAt(j+i) - 'a';
            }
            sb.append((char) (sum % 26 + 'a'));
        }
        return sb.toString();
    }

}


