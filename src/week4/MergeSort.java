package week4;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {8, 4, 5, 2, 9, 13, 3};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void merge(int[] arr, int start, int middle, int end) {
        int size1 = middle - start + 1;
        int size2 = end - middle;

        int[] firstArr = new int[size1];
        int[] secondArr = new int[size2];

        for (int i = 0; i < size1; i++) {
            firstArr[i] = arr[start + i];
        }
        for (int i = 0; i < size2; i++) {
            secondArr[i] = arr[middle + 1 + i];
        }

        int firstIndex = 0;
        int secondIndex = 0;
        int index = start;

        while (firstIndex < size1 && secondIndex < size2) {
            if (firstArr[firstIndex] <= secondArr[secondIndex]) {
                arr[index] = firstArr[firstIndex];
                firstIndex++;
            } else {
                arr[index] = secondArr[secondIndex];
                secondIndex++;
            }
            index++;
        }

        while (firstIndex < size1) {
            arr[index] = firstArr[firstIndex];
            firstIndex++;
            index++;
        }
        while (secondIndex < size2) {
            arr[index] = secondArr[secondIndex];
            secondIndex++;
            index++;
        }
    }

    public static void mergeSort(int[] arr, int start, int end) {
        if (start < end) {
            int middle = (start + end) / 2;
            mergeSort(arr, start, middle);
            mergeSort(arr, middle + 1, end);
            merge(arr, start, middle, end);
        }
    }
}
