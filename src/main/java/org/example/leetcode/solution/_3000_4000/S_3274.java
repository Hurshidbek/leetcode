package org.example.leetcode.solution._3000_4000;

class S_3274 {
    public static void main(String[] args) {
        var solution = new S_3274();
        System.out.println(!solution.checkTwoChessboards("a1", "h3"));
    }


    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        return (coordinate1.charAt(0) - 'a' + coordinate1.charAt(1) - '1') % 2 ==
                (coordinate2.charAt(0) - '1' + coordinate2.charAt(1) - '1') % 2;

    }

}


