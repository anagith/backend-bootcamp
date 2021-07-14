package week1.day4;

import java.util.Scanner;

public class Problem15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();
        int count = 1;
        if (firstNumber == secondNumber) {
            if (secondNumber == thirdNumber) {
                count += 2;
            } else {
                count++;
            }
        } else if (firstNumber == thirdNumber) {
            count++;
        } else if (secondNumber == thirdNumber) {
            count++;
        }
        System.out.println(count);
    }
}
