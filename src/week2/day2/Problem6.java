package week2.day2;

import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}
