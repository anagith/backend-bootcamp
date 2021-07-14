package week2.day3;

import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        int smallestPositive = 1000;
        for (int i = 0; i < size; i++) {
            if (array[i] < 1000 && array[i] > 0) {
                smallestPositive = array[i];
            }
        }
        System.out.println(smallestPositive);
    }
}
