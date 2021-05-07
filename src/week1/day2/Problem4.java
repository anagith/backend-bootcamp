package week1.day2;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        //Take two numbers as input from the console and display the product of two numbers
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int product = firstNumber * secondNumber;
        System.out.println(product);
    }
}
