package week1.day5;

import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        switch (number % 2) {
            case 0: {
                System.out.println("even");
                break;
            }
            default: {
                System.out.println("odd");
            }
        }
    }
}
