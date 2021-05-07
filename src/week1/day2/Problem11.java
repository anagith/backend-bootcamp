package week1.day2;

import java.util.Scanner;

public class Problem11 {
    public static void main(String[] args) {
        // Given int numbers ,input a and b from console, determine and print the reminder from deleting  a to b
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int remainder = a % b;
        System.out.println(a + " " + b + " " + remainder);

    }
}
