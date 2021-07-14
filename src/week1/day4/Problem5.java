package week1.day4;

import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();
        if (firstNumber >= secondNumber && secondNumber >= thirdNumber) {
            System.out.println("first number is the greatest");
        } else if (secondNumber >= thirdNumber) {
            System.out.println("second number is the greatest");
        } else {
            System.out.println("third number is the greatest");
        }
    }
}
