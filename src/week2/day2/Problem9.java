package week2.day2;

import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        int number;
        while (count < 10) {
            number = scanner.nextInt();
            sum += number;
            count++;
        }
        System.out.println(sum);
    }
}
