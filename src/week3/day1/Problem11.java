package week3.day1;

import java.util.Scanner;

public class Problem11 {
    public static void main(String[] args) {
        System.out.println(magicSum());
    }

    public static boolean hasEight(int number) {
        String str = String.valueOf(number);
        boolean hasEight = false;
        int digit;
        for (int i = 0; i < str.length(); i++) {
            digit = number % 10;
            if (digit == 8) {
                hasEight = true;
                break;
            }
            number /= 10;
        }
        return hasEight;
    }

    public static int magicSum() {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive integer (or -1 to end): ");
        int n = scanner.nextInt();
        while (n != -1) {
            if (hasEight(n)) {
                sum += n;
            }
            System.out.println("Enter a positive integer (or -1 to end):");
            n = scanner.nextInt();
        }
        return sum;
    }
}
