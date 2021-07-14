package week1.day4;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age <= 0) {
            System.out.println("Please enter a positive number");
        } else if (age < 18) {
            System.out.println("You're not eligible to vote");
        } else {
            System.out.println("You're eligible to vote");
        }
    }
}
