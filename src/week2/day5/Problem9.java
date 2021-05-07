package week2.day5;

import java.util.Scanner;

public class Problem9 {

    public static int NthPrime(int n) {
        int count ;
        int number = 2;
        int primeCount = 0;
        int prim = 0;
        while (primeCount < n) {
            count = 0;
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    count++;
                }
            }
            if (count == 1) {
                primeCount++;
                prim = number;
            }
            number++;
        }
        return prim;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int n = 1;
        String factors = new String();
        while (number != 1) {
            if (number % NthPrime(n) == 0) {
                factors += NthPrime(n) + " ";
                number /= NthPrime(n);
            } else {
                n++;
            }
        }
        System.out.println(factors);
    }
}
