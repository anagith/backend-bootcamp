package week3.day5;

import java.util.Scanner;

public class Problem11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int left = 0;
        int right = 100;
        System.out.println("mind number from 0 to 100");
        System.out.println(guessNumber(left, right));
        while (true) {
            int middle = (left + right) / 2;
            String choice = scanner.next();
            if (choice.equals("less")) {
                right = middle - 1;
                System.out.println(guessNumber(left, right));
            } else if (choice.equals("more")) {
                left = middle + 1;
                System.out.println(guessNumber(left, right));
            } else {
                break;
            }
        }
    }

    public static int guessNumber(int left, int right) {
        return (left + right) / 2;
    }
}
