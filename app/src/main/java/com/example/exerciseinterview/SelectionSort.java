package com.example.exerciseinterview;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arrInput = {64, 23, 63, 2, 3, 0};
        selectionSort(arrInput);
        System.out.println("Sorted array: " + arrayToString(arrInput));
    }

    public static void selectionSort(int[] arr) {
        int arrSize = arr.length;

        for (int i = 0; i < arrSize; i++) {
            int currentMinIndex = i;

            for (int j = i + 1; j < arrSize; j++) {
                if (arr[j] < arr[currentMinIndex]) {
                    currentMinIndex = j;
                }
            }

            // Swap elements
            int temp = arr[currentMinIndex];
            arr[currentMinIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }
}

