package week2.day3;

import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int count = 1;
        for (int i = 0; i < size - 1; i++) {
            if (array[i] != array[i + 1]) {
                count++;
            }
        }
        System.out.println(count);
    }
}
