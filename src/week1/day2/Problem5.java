package week1.day2;

import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        //Write a java program which has input number from console, and print the remainder.
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int remainder = number % 10;
        System.out.println(remainder);

    }
}
