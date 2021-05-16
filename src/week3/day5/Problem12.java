package week3.day5;

import java.util.Arrays;

public class Problem12 {
    public static void main(String[] args) {
        int[] arr = {-1, 150, 190, 170, -1, -1, 160, 180};
        System.out.println(Arrays.toString(sortWithoutMovingTrees(arr)));
    }

    public static int[] sortWithoutMovingTrees(int[] arr) {
        //using selection sort
        int min;
        int index;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != -1) {
                min = arr[i];
                index = i;
                for (int j = i; j < arr.length; j++) {
                    if (arr[j] < min && arr[j] != -1) {
                        min = arr[j];
                        index = j;
                    }
                }
                int temp = arr[i];
                arr[i] = min;
                arr[index] = temp;
            }
        }
        return arr;
    }
}
