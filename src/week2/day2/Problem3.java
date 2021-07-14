package week2.day2;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int from = scanner.nextInt();
        int to = scanner.nextInt();
        for (int i = from; i <= to; i++) {
            for (int j = 1; j <= i; j++) {
                if (Math.pow(j, 2) == i) {
                    System.out.print(i + " ");
                    break;
                }
            }
        }
    }
}
