package week1.day2;

import java.util.Scanner;

public class Problem18 {
    public static void main(String[] args) {
        //Given an integer  3-digit number, determine and print the sum of all 3 digits.
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;
        sum += number % 10;
        number /= 10;
        sum += number % 10;
        number /= 10;
        sum += number;
        System.out.println(sum);
    }
}
