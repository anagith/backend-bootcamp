package week3.day1;

import java.util.Random;

public class Problem14 {
    public static void main(String[] args) {
        int[] arr = initializeArray(5);
        printArray(arr);
        int[] copy = copyOf(arr);
        printArray(copy);
    }

    public static int[] copyOf(int[] array) {
        int[] copy = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }
        return copy;
    }

    public static int[] initializeArray(int size) {
        Random random = new Random();
        int[] ints = new int[size];
        for (int i = 0; i < size; i++) {
            ints[i] = random.nextInt(10);
        }
        return ints;
    }

    public static void printArray(int[] arr) {
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
