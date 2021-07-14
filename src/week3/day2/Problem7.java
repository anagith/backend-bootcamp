package week3.day2;

import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        System.out.println(max(a, b));
        System.out.println(max(a, b, c));
        System.out.println(max(a, b, c, d));
    }

    public static int max(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    public static int max(int a, int b, int c) {
        if (a > b) {
            if (b > c) {
                return a;
            }
            if (c < a) {
                return a;
            }
        } else {
            if (a > c) {
                return b;
            }
            if (c < b) {
                return b;
            }
        }
        return c;
    }

    public static int max(int a, int b, int c, int d) {
        return max(max(a, b), max(c, d));
    }
}
