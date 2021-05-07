package week2.day2;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int digit = scanner.nextInt();
        int count = 0;
        int retain;
        while (number > 0) {
            retain = number % 10;
            if (retain == digit) {
                count++;
            }
            number /= 10;
        }
        System.out.println(count);
    }
}
