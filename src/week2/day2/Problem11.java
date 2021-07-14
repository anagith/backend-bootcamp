package week2.day2;

import java.util.Scanner;

public class Problem11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOfNumbers = scanner.nextInt();
        int countOfPositive = 0;
        int countOfNegative = 0;
        int countOfZero = 0;
        int number;
        while (countOfNumbers > 0) {
            number = scanner.nextInt();
            if (number > 0) {
                countOfPositive++;
            } else if (number < 0) {
                countOfNegative++;
            } else {
                countOfZero++;
            }
            countOfNumbers--;
        }
        System.out.println("Number of zeros " + countOfZero);
        System.out.println("Number of positives " + countOfPositive);
        System.out.println("Number of negatives " + countOfNegative);
    }
}
