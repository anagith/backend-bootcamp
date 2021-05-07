package week2.day3;

import java.util.Scanner;

public class Problem11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int temp;
        if (size % 2 == 0) {
            for (int i = 0; i < size - 1; i += 2) {
                temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }

        } else {
            for (int i = 0; i < size - 2; i += 2) {
                temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }
        }
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
