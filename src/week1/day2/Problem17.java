package week1.day2;

import java.util.Scanner;

public class Problem17 {
    public static void main(String[] args) {
        //Given an integer  3-digit number, determine and print the first digit.
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int firstDigit = number / 100;
        System.out.println(firstDigit);
    }
}
