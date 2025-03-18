package org.example.leetcode.solution._2000_3000;

class S_2864 {
    public static void main(String[] args) {
        var solution = new S_2864();

        solution.maximumOddBinaryNumber("0101");
    }

    public String maximumOddBinaryNumber(String s) {
        int count1 = 0;
        for(char c: s.toCharArray()){
            if (c=='1'){
                count1++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length()-1; i++) {
            if (count1>1){
                sb.append(1);
                count1--;
            }else {
                sb.append(0);
            }

        }
        return sb.append(1).toString();
    }
}