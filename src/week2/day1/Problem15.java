package week2.day1;

import java.util.Scanner;

public class Problem15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int max = input;
        int secondMax = input;
        while (input != 0) {
            input = scanner.nextInt();
            if (max != secondMax) {
                if (input > max) {
                    secondMax = max;
                    max = input;
                } else if (input > secondMax) {
                    secondMax = input;
                }
            } else {
                if (input < max) {
                    secondMax = input;
                } else {
                    max = input;
                }
            }
        }
        System.out.println(secondMax);
    }
}
