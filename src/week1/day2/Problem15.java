package week1.day2;

import java.util.Scanner;

public class Problem15 {
    public static void main(String[] args) {
        // Determine if the given int number is odd,print result
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int remainder = number % 2;
        boolean isOdd = (remainder == 0);
        System.out.println(isOdd);
    }
}
