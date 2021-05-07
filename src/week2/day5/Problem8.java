package week2.day5;

import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstTerm = scanner.nextDouble();
        double denominator = scanner.nextDouble();
        int n = scanner.nextInt();
        double nthTerm = firstTerm;
        for (int i = 0; i < n - 1; i++) {
            nthTerm *= denominator;
        }
        System.out.format("%.2f", nthTerm);
    }
}
