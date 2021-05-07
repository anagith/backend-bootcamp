package week2.day2;

import java.util.Scanner;

public class Problem17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        int countOfLowerCase = 0;
        int countOfUpperCase = 0;
        int countOfSymbols = 0;
        int countOfNumber = 0;
        int length = input.length();
        if (length < 6 || length > 16) {
            System.out.println("invalid");
        } else {
            for (int i = 0; i < length; i++) {
                int ch = input.charAt(i);
                if (ch >= 48 && ch <= 57) {
                    countOfNumber++;
                } else if (ch >= 65 && ch <= 90) {
                    countOfUpperCase++;
                } else if (ch >= 97 && ch <= 122) {
                    countOfLowerCase++;
                } else if (ch == 35 || ch == 36 || ch == 64) {
                    countOfSymbols++;
                }
            }
            if (countOfLowerCase < 1 || countOfUpperCase < 1
                    || countOfNumber < 1 || countOfSymbols < 1) {
                System.out.println("invalid");
            } else {
                System.out.println("valid");
            }
        }
    }
}
