package week2.day3;

import java.util.Scanner;

public class Problem16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] == 0) {
                count++;
            } else if (count != 0) {
                array[i - count] = array[i];
                array[i] = 0;
            }
        }

        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
