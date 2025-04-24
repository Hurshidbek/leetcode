package org.example.leetcode.solution._1000_2000;

import java.util.Arrays;

public class S_1402 {
    public static void main(String[] args) {
        var solution = new S_1402();

        System.out.println(solution.maxSatisfaction(new int[]{-1, -8, 0, 5, -9}));
    }

    public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        int res = 0, total = 0, sum = 0;

        for (int i = satisfaction.length - 1; i >= 0; i--) {
            sum += satisfaction[i];
            total += sum;

            if (res < total) res = total;
            if (total < 0) break;
        }
        return res;
    }

    public int maxSatisfaction2(int[] satisfaction) {
        int n = satisfaction.length;
        int[] sorted = new int[n];

        quickSort(satisfaction, 0, satisfaction.length - 1);

        for (int i = 0; i < n; i++) {
            sorted[i] = satisfaction[n - 1 - i];
        }

        int maxSum = 0;
        int currentSum = 0;
        int total = 0;

        for (int i = 0; i < n; i++) {
            currentSum += sorted[i];
            total += currentSum;

            if (total > maxSum)
                maxSum = total;
            if (total < 0)
                break;
        }
        return maxSum;
    }

    private void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;

                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}