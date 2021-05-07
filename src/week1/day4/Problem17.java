package week1.day4;

import java.util.Scanner;

public class Problem17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();
        int temp;
        if (firstNumber > secondNumber) {
            temp = secondNumber;
            secondNumber = firstNumber;
            firstNumber = temp;
        }
        if (firstNumber > thirdNumber) {
            temp = thirdNumber;
            thirdNumber = firstNumber;
            firstNumber = temp;
        }
        if (secondNumber > thirdNumber) {
            temp = thirdNumber;
            thirdNumber = secondNumber;
            secondNumber = temp;
        }
        System.out.println(firstNumber + " " + secondNumber + " " + thirdNumber);
    }
}
