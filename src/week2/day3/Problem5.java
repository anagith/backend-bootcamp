package week2.day3;

import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 1; i < size; i++) {
            if ((array[i] > 0 && array[i - 1] > 0) ||
                    (array[i] < 0 && array[i - 1] < 0)) {
                System.out.print(array[i - 1] + " " + array[i]);
                break;
            }
        }
    }
}
