package week2.day1;

import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if (input % 2 != 0) {
            input--;
        }
        while (input > 0) {
            System.out.print(input + " ");
            input -= 2;
        }
    }
}
