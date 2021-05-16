package week3.day5;

import java.util.Arrays;

public class Problem6 {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 8, 2};
        System.out.println(Arrays.toString(selectionSort(arr)));
        System.out.println("min value is " + selectionSort(arr)[0]);
        System.out.println("max value is " + selectionSort(arr)[arr.length - 1]);
    }

    public static int[] selectionSort(int[] arr) {
        int min;
        int index;
        for (int i = 0; i < arr.length; i++) {
            min = arr[i];
            index = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    index = j;
                }
            }
            int temp = arr[i];
            arr[i] = min;
            arr[index] = temp;
        }
        return arr;
    }
}
