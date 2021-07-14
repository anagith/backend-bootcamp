package week2.day3;

import java.util.Scanner;

public class Problem15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int countOfUnique = 0;
        for (int i = 0; i < size; i++) {
            int count = 0;
            for (int j = 0; j < size; j++) {
                if (array[i] == array[j] && i != j) {
                    count++;
                }
            }
            if (count == 0) {
                countOfUnique++;
            }
        }
        System.out.println(countOfUnique);
    }
}
