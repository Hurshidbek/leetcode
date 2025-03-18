package org.example.leetcode.solution._2000_3000;

class S_2469 {
    public static void main(String[] args) {
        var solution = new S_2469();
        solution.convertTemperature(36.50);
    }

    public double[] convertTemperature(double celsius) {
        return new double[]{celsius + 273.15, celsius * 1.80 + 32.00};
    }

}