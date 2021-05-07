package week2.day1;

import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int i = 1;
        while (i <= input) {
            System.out.print(i + " ");
            i *= 2;
        }
    }
}
