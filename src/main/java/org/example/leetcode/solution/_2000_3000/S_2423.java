package org.example.leetcode.solution._2000_3000;

public class S_2423 {
    public static void main(String[] args) {
        S_2423 solution = new S_2423();

        System.out.println(solution.equalFrequency("abcc"));
    }

    public boolean equalFrequency(String word) {
        int[] charCount = new int[26];
//        int[] countCount = new int[101];

        for (char c : word.toCharArray()) {
            charCount[c - 'a']++;
        }

        int count1 = 0;
        int count2 = 0;

        for (int i : charCount) {
            if (i == 0) continue;

            if (count1 == 0){
                count1 ++;
            }
            else if (count2 == 0){
                count2++;
            }
            else {

            }
        }


        return true;
    }
}
