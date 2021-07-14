package week1.day5;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int max = a > b ? a : b;
        int abs = a > 0 ? a : -a;
        System.out.println(max);
        System.out.println(abs);
    }
}
