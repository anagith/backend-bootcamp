package week2.day5;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int power = scanner.nextInt();
        int powerOfTwo = 1;
        for (int i = 0; i < power; i++) {
            powerOfTwo *= 2;
        }
        System.out.println(powerOfTwo);
    }
}
