package week2.day2;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int from = scanner.nextInt();
        int to = scanner.nextInt();
        int remainder = scanner.nextInt();
        int divedBy = scanner.nextInt();
        for (int i = from; i <= to; i++) {
            if (i % divedBy == remainder) {
                System.out.print(i + " ");
            }
        }
    }
}
