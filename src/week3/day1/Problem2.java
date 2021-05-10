package week3.day1;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        int n = scanner.nextInt();
        System.out.println(power(a, n));
    }

    public static double power(double a, int n) {
        int power = 1;
        for (int i = 0; i < n; i++) {
            power *= a;
        }
        return power;
    }
}
