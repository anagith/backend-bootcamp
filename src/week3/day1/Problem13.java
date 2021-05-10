package week3.day1;

import java.util.Random;

public class Problem13 {
    public static void main(String[] args) {
        int[] arr = initializeArray(5);
        System.out.println(search(arr, 2));
    }

    public static int search(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static int[] initializeArray(int size) {
        Random random = new Random();
        int[] ints = new int[size];
        for (int i = 0; i < size; i++) {
            ints[i] = random.nextInt(10);
        }
        return ints;
    }

}
