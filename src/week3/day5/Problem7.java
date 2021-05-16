package week3.day5;

import java.util.Arrays;

public class Problem7 {
    public static void main(String[] args) {
        String[] arr = {"aba", "abc", "aaa", "adef"};
        System.out.println(Arrays.toString(selectionSort(arr)));
        System.out.println("min value is " + selectionSort(arr)[0]);
        System.out.println("max value is " + selectionSort(arr)[arr.length - 1]);

    }

    public static String[] selectionSort(String[] arr) {
        String min;
        int index;
        for (int i = 0; i < arr.length; i++) {
            min = arr[i];
            index = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j].compareTo(min) < 0) {
                    min = arr[j];
                    index = j;
                }
            }
            String temp = arr[i];
            arr[i] = min;
            arr[index] = temp;
        }
        return arr;
    }
}
