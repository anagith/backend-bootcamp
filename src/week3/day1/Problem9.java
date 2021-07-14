package week3.day1;

import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(isPalindrome(n));
    }

    public static boolean isPalindrome(int n) {
        boolean isPalindrome = false;
        String str = String.valueOf(n);
        int num = n;
        int reverse = 0;
        int size = str.length();
        for (int i = 0; i < size; i++) {
            reverse += (n % 10) * Math.pow(10, size - i - 1);
            n /= 10;
        }
        if (num == reverse) {
            isPalindrome = true;
        }
        return isPalindrome;
    }
}
