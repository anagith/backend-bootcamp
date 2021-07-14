package week2.day1;

import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int i = 1;
        int count = 0;
        while (i < input) {
            i *= 2;
            count++;
        }
        System.out.println(count);
    }
}
