package week1.day2;

import java.util.Scanner;

public class Problem16 {
    public static void main(String[] args) {
        //Given an integer 3-digit number, determine and print the second digit.
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int secondDigit = (number / 10) % 10;
        System.out.println(secondDigit);
    }
}
