package week1.day2;

import java.util.Scanner;

public class Problem19 {
    public static void main(String[] args) {
        //Given two numbers,swap them
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        firstNumber += secondNumber;
        secondNumber = firstNumber - secondNumber;
        firstNumber -= secondNumber;
        System.out.println(firstNumber + " " + secondNumber);
    }
}
