package week2.day2;

import java.util.Scanner;

public class Problem13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int square = scanner.nextInt();
        for (int i = 0; i < square; i++) {
            for (int j = 0; j < square; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
