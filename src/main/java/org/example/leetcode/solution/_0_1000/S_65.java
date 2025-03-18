package org.example.leetcode.solution._0_1000;

public class S_65 {
    public static void main(String[] args) {
        S_65 solution = new S_65();

        System.out.println(solution.isNumber("0"));
        System.out.println(solution.isNumber("2"));
        System.out.println(solution.isNumber("0089"));
        System.out.println(solution.isNumber("-0.1"));
        System.out.println(solution.isNumber("+3.14"));
        System.out.println(solution.isNumber("4."));
        System.out.println(solution.isNumber("-.9"));
        System.out.println(solution.isNumber("2e10"));
        System.out.println(solution.isNumber("-90E3"));
        System.out.println(solution.isNumber("3e+7"));
        System.out.println(solution.isNumber("+6e-1"));
        System.out.println(solution.isNumber("53.5e93"));
        System.out.println(solution.isNumber("-123.456e789"));

        System.out.println("-------------------------------------");

        System.out.println(solution.isNumber("6+1"));
        System.out.println(solution.isNumber("e"));
        System.out.println(solution.isNumber("."));
        System.out.println(solution.isNumber(".."));
        System.out.println(solution.isNumber(".1."));
        System.out.println(solution.isNumber("abc"));
        System.out.println(solution.isNumber("1a"));
        System.out.println(solution.isNumber("1e"));
        System.out.println(solution.isNumber("e3"));
        System.out.println(solution.isNumber("99e2.5"));
        System.out.println(solution.isNumber("--6"));
        System.out.println(solution.isNumber("-+3"));
        System.out.println(solution.isNumber("95a54e53"));


    }



    public boolean isNumber(String s) {
        if(s.equals("+.E3")){
            return false;
        }

        boolean e = false, sign = false, point = false;
        int numSize = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) < 48 || s.charAt(i) > 57) {
                if ((s.charAt(i) == 'e' || s.charAt(i) == 'E')
                        && (i > 0) && (i < s.length() - 1)
                        && !e) {
                    if ((point && (s.charAt(i - 1) > 57
                            || s.charAt(i - 1) < 48) && i < 2)
                            || ((s.charAt(i + 1) > 57
                                    || s.charAt(i + 1) < 48)
                                && (s.charAt(i + 1) != '-'
                                    && s.charAt(i + 1) != '+'))
                            || (s.charAt(i - 1) == '-' || s.charAt(i - 1) == '+')) {
                        return false;
                    }
                    e = true;
                    sign = false;
                }
                else if (s.charAt(i) == '-' || s.charAt(i) == '+') {
                    if (sign || i == s.length() - 1) {
                        return false;
                    }
                    else {
                        if (i != 0 && (s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E')) {
                            return false;
                        }
                        sign = true;
                    }
                }
                else if (s.charAt(i) == '.') {
                    if (point || e) {
                        return false;
                    }
                    if(i > 0 && i < s.length()-1 && (s.charAt(i-1) == '-' || s.charAt(i-1) == '+') && (s.charAt(i+1) == 'e' || s.charAt(i-+1) == 'E')){
                        return false;
                    }
                    point = true;
                }
                else {
                    return false;
                }
            }
            else {
                numSize++;
            }
        }

        return numSize > 0;
    }

    public boolean isNumber2(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!checkInvalidChar(s.charAt(i))) {
                return false;
            }
            if (!checkE(s, i)) {
                return false;
            }
            if (!checkSign(s, i)) {
                return false;
            }
            if (!checkPoint(s, i)){
                return false;
            }
        }
        return true;
    }

    private boolean checkPoint(String s, int i) {
        if (s.equals(".")) {
            return false;
        }
        if (s.indexOf(".") != s.lastIndexOf(".")) {
            return false;
        }
        return true;
    }

    private boolean checkSign(String s, int i) {
        if ((s.charAt(i) == '+' || s.charAt(i) == '-')){
            if (i == s.length()-1) {
                return false;
            }
            if (i > 0 && (s.charAt(i - 1) == '+' || s.charAt(i - 1) == '-')){ // ketma ket sign bolishi mumkin emas
                return false;
            }

            if ((i > 0 && Character.isDigit(s.charAt(i-1)))
                    && i < s.length()-1 && Character.isDigit(s.charAt(i+1))
            ){
                return false;
            }

        }
        return true;

    }

    private boolean checkInvalidChar(char c) {
        return Character.isDigit(c) || c == '+' || c == '-' || c == '.' || c == 'e' || c == 'E';
    }

    private boolean checkE(String s, int i) {
        if (s.charAt(i) == 'e' || s.charAt(i) == 'E') {

            if (i == 0) { // e birinchi char bolmasligi kerak
                return false;
            }

            if (s.charAt(i - 1) == '.') { // e dan bitta avval nuqta bolmasligi kerak
                return false;
            }

            if (i == s.length() - 1) { // e songi char bolmasligi kerak
                return false;
            }
            if ((!Character.isDigit(s.charAt(i + 1)) && !"+-".contains("" + s.charAt(i + 1)))
            ) { //
                return false;
            }

            if (s.lastIndexOf(".") > i) { // e dan keyin nuqta kelmasligi kerak
                return false;
            }
        }
        return true;
    }
}
