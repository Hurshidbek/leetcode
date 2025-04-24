package org.example.leetcode.solution._0_1000;

public class S_423 {
    public static void main(String[] args) {
        var solution = new S_423();

        solution.convert("A", 1);
        solution.convert("1234567890123456789012345678901234567890", 5);
    }

    public String convert(String s, int numRows) {
        if (numRows-- == 1) return s;

        StringBuilder sb = new StringBuilder();
        int pointer;

        for (int row = 0; row <= numRows; row++) {
            pointer = row;
            while (pointer < s.length()) {
                sb.append(s.charAt(pointer));

                int nextInd = pointer + 2 * (numRows - row);
                if (row > 0 && row < numRows && nextInd < s.length())
                    sb.append(s.charAt(nextInd));

                pointer += 2 * numRows;
            }
        }

        return sb.toString();
    }
}