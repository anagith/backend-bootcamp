package week2.day3;

import java.util.Scanner;

public class Problem13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int max = array[0];
        int min = array[0];
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            } else if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
        }
        array[minIndex] = max;
        array[maxIndex] = min;
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
