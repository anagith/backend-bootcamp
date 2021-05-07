package week1.day2;

import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        //Input from console 3 arguments and then prints the sum, the difference, the average;
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNUmber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();
        int sum = firstNumber + secondNUmber + thirdNumber;
        int difference = firstNumber - secondNUmber - thirdNumber;
        double average = sum / 3;
        System.out.println(sum);
        System.out.println(difference);
        System.out.println(average);
    }
}
