package week1.day2;

import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        //Given int number,input from console, find last digit and print it.
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int lastDigit = number % 10;
        System.out.println(lastDigit);
    }
}
