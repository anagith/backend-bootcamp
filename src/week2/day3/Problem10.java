package week2.day3;

import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int[] reversedArray = new int[size];
        for (int i = 0; i < size; i++) {
            reversedArray[size - i - 1] = array[i];
        }
        for (int i = 0; i < size; i++) {
            System.out.print(reversedArray[i] + " ");
        }
    }
}
