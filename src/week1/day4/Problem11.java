package week1.day4;

import java.util.Scanner;

public class Problem11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a > b) {
            if (b != 10) {
                System.out.println("both a and b are legal");
            } else {
                System.out.println("a is legal b is illegal");
            }
        } else {
            if (b != 10) {
                System.out.println("b is legal a is illegal");
            } else {
                System.out.println("both a and b are illegal");
            }
        }

        if (a % 5 != 0) {
            if (b % 5 == 0) {
                System.out.println("both are legal");
            } else {
                System.out.println("a is legal,b is illegal");
            }
        } else {
            if (b % 5 == 0) {
                System.out.println("b is legal,a is illegal");
            } else {
                System.out.println("both are illegal");
            }
        }
    }
}
