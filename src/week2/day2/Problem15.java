package week2.day2;

import java.util.Scanner;

public class Problem15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        while (input < 0) {
            input = scanner.nextInt();
        }
        for (int i = 1; i <= input; i++) {
            for (int j = 1; j <= input; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
}
