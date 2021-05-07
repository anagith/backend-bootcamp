package week2.day5;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int count = 0;
        boolean isPrime = false;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        if (count == 1) {
            isPrime = true;
        }
        System.out.println(isPrime);
    }
}
