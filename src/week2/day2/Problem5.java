package week2.day2;

import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String string = String.valueOf(number);
        int length = string.length();
        int reverse = 0;
        for (int i = length - 1; i >= 0; i--) {
            reverse += (number % 10) * Math.pow(10, i);
            number /= 10;
        }
        System.out.println(reverse);
    }
}
