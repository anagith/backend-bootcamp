package week2.day3;

import java.util.Scanner;

public class Problem14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int index = scanner.nextInt();
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        for (int i = 0; i < size - 1; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
