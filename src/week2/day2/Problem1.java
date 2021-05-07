package week2.day2;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int from = scanner.nextInt();
        int to = scanner.nextInt();
        if (from % 2 == 0) {
            for (int i = from; i <= to; i += 2) {
                System.out.print(i + " ");
            }
        } else {
            for (int i = from + 1; i <= to; i += 2) {
                System.out.print(i + " ");
            }
        }
    }
}
