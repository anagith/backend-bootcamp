package week3.day1;

import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(isPrime(n));
    }

    public static boolean isPrime(int n) {
        boolean isPrime = false;
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 1) {
            isPrime = true;
        }
        return isPrime;
    }

}
