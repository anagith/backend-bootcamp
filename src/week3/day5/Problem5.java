package week3.day5;

import java.util.Arrays;

public class Problem5 {
    public static void main(String[] args) {
        int[] arr = {9, 5, 3, 2, 6, 8};
        int min = bubbleSort(arr)[0];
        int max = bubbleSort(arr)[arr.length - 1];
        int avg = (min + max) / 2;
        int result = binarySearch(arr, 0, arr.length - 1, avg);
        System.out.println(Arrays.toString(bubbleSort(arr)));
        System.out.println(min);
        System.out.println(max);
        System.out.println(result);
    }


    public static int binarySearch(int[] arr, int left, int right, int key) {
        while (left <= right) {
            int middle = (left + right) / 2;
            if (arr[middle] == key) {
                return middle;
            }
            if (arr[middle] < key) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return -1;
    }

    public static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            {
                for (int j = 0; j < arr.length - i - 1; j++)
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
            }
        }
        return arr;
    }
}
