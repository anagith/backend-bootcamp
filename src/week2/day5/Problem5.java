package week2.day5;

import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int from = a / 100;
        int to = b / 100;
        for (int i = from; i <= to; i++) {
            int x = i % 10;
            int y = i / 10;
            int num = i * 100 + x * 10 + y;
            System.out.print(num + " ");
        }
    }
}
