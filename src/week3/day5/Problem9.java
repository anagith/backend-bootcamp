package week3.day5;

import java.util.Arrays;

public class Problem9 {
    public static void main(String[] args) {
        int[] arr = {5, 2, 7, 3, 8};
        System.out.println(Arrays.toString(insertionSort(arr)));
        System.out.println(binarySearch(arr, 8, 0, arr.length));
    }

    public static int binarySearch(int[] arr, int key, int left, int right) {
        if (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] < key) {
                return binarySearch(arr, key, mid + 1, right);
            }
            if (arr[mid] > key) {
                return binarySearch(arr, key, left, mid - 1);
            }
        }
        return -1;
    }

    public static int[] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                --j;
            }
            arr[j + 1] = key;
        }
        return arr;
    }
}
