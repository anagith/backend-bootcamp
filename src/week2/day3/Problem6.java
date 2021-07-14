package week2.day3;

import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int largest = array[0];
        int index = 0;
        for (int i = 0; i < size - 1; i++) {
            if (largest < array[i + 1]) {
                largest = array[i + 1];
                index = i + 1;
            }
        }
        System.out.println("the largest is " + largest);
        System.out.println("index is " + index);
    }
}
