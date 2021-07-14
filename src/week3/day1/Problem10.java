package week3.day1;

import java.util.Scanner;

import static java.lang.System.in;

public class Problem10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        int number = scanner.nextInt();
        System.out.println(hasEight(number));
    }

    public static boolean hasEight(int number) {
        String str = String.valueOf(number);
        boolean hasEight = false;
        int digit;
        for (int i = 0; i < str.length(); i++) {
            digit = number % 10;
            if (digit == 8) {
                hasEight = true;
                break;
            }
            number /= 10;
        }
        return hasEight;
    }
}
