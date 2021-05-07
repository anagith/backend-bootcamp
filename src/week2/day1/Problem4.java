package week2.day1;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int i = 2;
        while (i <= input) {
            if (input % i == 0) {
                System.out.print(i + " ");
                break;
            }
            i++;
        }
    }
}
